package com.ri.bootcamp.learn.utility;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.ri.bootcamp.learn.domain.BaseDomain;
import com.ri.bootcamp.learn.exception.ClassMismatchException;
import com.ri.bootcamp.learn.exception.CustomGenericException;

@Service
@Scope("prototype")
public class BeanMapperUtil<T> {

	public T copyNonNullProperties(T target, T source) throws ClassMismatchException {
		if (source == null || target == null) {
			throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417,
					"Source or Target Class types is NULL , target : " + target + " source : " + source,
					"Source or Target Class types is NULL , target : " + target + " source : " + source);
		}
		if (target.getClass() != source.getClass()) {
			throw new ClassMismatchException("Source and Target must be of same Class types : Target : "
					+ target.getClass() + "  Source: " + source.getClass());
		}

		final BeanWrapper srcBeanWrapper = new BeanWrapperImpl(source);
		final BeanWrapper trgBeanWrapper = new BeanWrapperImpl(target);
		final List<Field> targetFields = getFields(target);

		for (final Field property : targetFields) {
			Object srcVariable = srcBeanWrapper.getPropertyValue(property.getName());
			Object targetVariable = trgBeanWrapper.getPropertyValue(property.getName());
			if (srcVariable != null) {
				boolean isBaseDomainVariable = BaseDomain.class.isAssignableFrom(srcVariable.getClass());
				if (isBaseDomainVariable) {
					BeanMapperUtil<Object> myBeanUtils = new BeanMapperUtil<>();
					targetVariable = myBeanUtils.copyNonNullProperties(targetVariable, srcVariable);
					trgBeanWrapper.setPropertyValue(property.getName(), targetVariable);
				} else if (!(srcVariable instanceof Collection<?>)) {
					trgBeanWrapper.setPropertyValue(property.getName(), srcVariable);
				}
			} else if (property.getType() == Date.class) {
				trgBeanWrapper.setPropertyValue(property.getName(), srcVariable);
			}
		}
		return target;
	}

	public static <T> List<Field> getFields(T target) {
		List<Field> fields = new ArrayList<>();
		Class clazz = target.getClass();
		while (clazz != Object.class) {
			fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
			clazz = clazz.getSuperclass();
		}
		return fields;
	}

}