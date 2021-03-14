package com.ri.bootcamp.learn.utility;

import java.text.DecimalFormat;
import java.util.Date;

public class StringConstantsUtil {

    public static final String URL_DATA = "/products/stocktransfer-lot/transfer-import";
    public static final String URL_AUTH = "/users/authenticate";
    public static final String EMPTY_DATA_PLACEHOLDER = "-";

    public static final Date EMPTY_DATE_PLACEHOLDER = null;

    public static final String START_TIME = " 00:00:00";

    public static final String END_TIME = " 23:59:59";

    public static final String TIME_FORMAT = " HH:mm:ss";

    public static final String START_TIME_TZ = "T00:00:00Z";
    public static final String END_TIME_TZ = "T23:59:59Z";
    public static final double PERCENTAGE = 100;
    public static final double TAX = 103;
    public static final double TAX_FRACTION = 0.03;
    public static final long MAX_FILE_SIZE = 2097152L;
    public static final String DOUBLE_VALUE = "0.0";
    public static final int EXCH_DFLT_QTY = 1;
    public static final int ACTIVE_STATUS_AVAILABLE = 1;
    public static final int ACTIVE_STATUS_USED = 2;
    public static final double CASH_ADVANCE_THRESHOLD = 10000;
    public static final double SALES_THRESHOLD = 200000;

    public static final DecimalFormat DF_AMOUNT = new DecimalFormat("0.00");
    public static final DecimalFormat DF_WEIGHT = new DecimalFormat("0.000");
    public static final DecimalFormat DF_FOUR_DIGIT = new DecimalFormat("0.0000");
    public static final String SPACE_FILLER = "^";

    public static final String COST = "cost";
    public static final String TOTALVALUE = "totalValue";
//    Json Keys

    public static final String KEY_STR = "key";

    public static final String VALUE_STR = "value";

//    TIME_ZONE

    public static final String START_TIME_STR = "start_time";
    public static final String END_TIME_STR = "end_time";
    public static final String TIME_ZONE_STR = "time_zone";
    public static final String TIMEZONE_KOLKATA = "Asia/Kolkata";
    public static final String EMP_SERVER_ACCESS_TIME = "employee_server_access_time";
    public static final String SALE_THRESHOLD = "sales_threshold";

    public static final String NET_WEIGHT = "netWeight";
    public static final String LESS_WEIGHT = "lessWeight";
    public static final String EMPTY_FIELD = "";
    public static final String WASTAGE_VALUE = "wastageValue";
    public static final String WASTAGE_VALUE_FROM = "wastageValueFrom";
    public static final String WASTAGE_VALUE_TO = "wastageValueTo";

    public static final String SPLIT_COMMA_REGEXP = ",";
    public static final String SPLIT_EQUAL_REGEXP = "=";
    public static final String ONLINE_PAYMENT_DUE_NUM = "due_number";
    public static final String RANDOM_NUMBER_6D = "%06d";
    public static final String RANDOM_NUMBER_7D = "%07d";
    public static final String RANDOM_NUMBER_8D = "%08d";
    public static final String RANDOM_NUMBER_9D = "%09d";

    public static final String INVOICE_DATE_FROM = "invoiceDateFrom";

    public static final String INVOICE_DATE_TO = "invoiceDateTo";

    public static final String DATE_OF_JOIN = "dateOfJoin";

    public static final String DATE_OF_JOIN_FROM = "dateOfJoinFrom";

    public static final String DATE_OF_JOIN_TO = "dateOfJoinTo";

    public static final String LAST_PURCHASE_DATE = "lastPurchaseDate";
    public static final String LAST_PURCHASE_DATE_FROM = "lastPurchaseDateFrom";
    public static final String LAST_PURCHASE_DATE_TO = "lastPurchaseDateTo";

    public static final String LAST_VISIT_DATE = "lastVisitDate";
    public static final String LAST_VISIT_DATE_FROM = "lastVisitDateFrom";
    public static final String LAST_VISIT_DATE_TO = "lastVisitDateTo";

    public static final String TRANSACTION_DATE = "transactionDate";

    public static final String TRANSACTION_DATE_FROM = "transactionDateFrom";

    public static final String TRANSACTION_DATE_TO = "transactionDateTo";

    public static final String NET_WEIGHT_FROM = "netWeightFrom";

    public static final String NET_WEIGHT_TO = "netWeightTo";

    public static final String GROSS_WEIGHT = "grossWeight";

    public static final String PRODUCT_LABEL = "productLabel";

    public static final String REMARK = "remark";

    public static final String ADVANCE_NUMBER = "advanceNumber";

    public static final String PROCESS_TYPE = "processType";

    public static final String LABEL = "label";

    public static final String TOTAL_GROSS_WEIGHT = "totalGrossWeight";

    public static final String TOTAL_GROSS_WEIGHT_FROM = "totalGrossWeightFrom";

    public static final String TOTAL_GROSS_WEIGHT_TO = "totalGrossWeightTo";

    public static final String TOTAL_NET_WEIGHT = "totalNetWeight";

    public static final String TOTAL_NET_WEIGHT_FROM = "totalNetWeightFrom";

    public static final String TOTAL_NET_WEIGHT_TO = "totalNetWeightTo";

    public static final String GROSS_WEIGHT_FROM = "grossWeightFrom";

    public static final String GROSS_WEIGHT_TO = "grossWeightTo";

    public static final String GROSSWEIGHT = "grossweight";

    public static final String PURE_WEIGHT = "pureweight";

    public static final String PURE_WT = "pureWeight";

    public static final String COMMISSIONVALUE = "commissionValue";

    public static final String PURE = "pure";

    public static final String FLAT = "flat";

    public static final String PER_GRAM = "pergm";

    public static final String PERCENTAGE_CHAR = "percentage";

    public static final String WEIGHT = "weight";

    public static final String JSONFILTER = "$.";

    public static final String JSONFILTER_ARRAY = "$[0].";

    public static final String JSONFILTER_ARRAY_ALL = "$[*].";

    public static final String JSON_UNQUOTE = "JSON_UNQUOTE";

    public static final String JSON_EACH = "JSON_EACH";

    public static final String JSON_EXTRACT = "JSON_EXTRACT";

    public static final String GROUP_CONCAT = "group_concat";

    public static final String CREATED_AT = "createdAt";

    public static final String DATE_STR = "Date";

    public static final String CREATED_AT_FROM = "createdAtFrom";

    public static final String CREATED_AT_TO = "createdAtTo";

    public static final String UPDATED_AT = "updatedAt";

    public static final String UPDATED_AT_FROM = "updatedAtFrom";

    public static final String UPDATED_AT_TO = "updatedAtTo";

    public static final String PAIDDATE = "paidDate";
    public static final String PAIDDATE_FROM = "paidDateFrom";
    public static final String PAIDDATE_TO = "paidDateTo";
    public static final String NEXT_PAIDDATE_FROM = "nextPaidDateFrom";
    public static final String NEXT_PAIDDATE_TO = "nextPaidDateTo";
    public static final String RESP_DATE = "responseDate";
    public static final String RESP_DATE_FROM = "responseDateFrom";
    public static final String RESP_DATE_TO = "responseDateTo";
    public static final String PAID = "paid";

    public static final String DUEDATE = "dueDate";
    public static final String DUEDATE_FROM = "dueDateFrom";
    public static final String DUEDATE_TO = "dueDateTo";

    public static final String CR_DATE = "creditDate";
    public static final String CR_DATE_FROM = "creditDateFrom";
    public static final String CR_DATE_TO = "creditDateTo";

    public static final String FOLLOW_UP_DATE = "followUpDate";
    public static final String FOLLOW_UP_FROM = "followUpFrom";
    public static final String FOLLOW_UP_TO = "followUpTo";

    public static final String EXPECTED_DATE_FROM = "expectedDateFrom";
    public static final String EXPECTED_DATE_TO = "expectedDateTo";

    public static final String AUDIT_DATE = "auditDateTime";
    public static final String AUDIT_DATE_FROM = "auditDateTimeFrom";
    public static final String AUDIT_DATE_TO = "auditDateTimeTo";

    public static final String ENROLLMENT_DATE_FROM = "enrollmentDateFrom";
    public static final String ENROLLMENT_DATE_TO = "enrollmentDateTo";

    public static final String BEFORE_CREATED_AT = "beforeCreatedAt";

    public static final String EMP_MONTH_ATTEND_DATE = "employeeMonthlyAttendanceDate";

    public static final String DATE_OF_BIRTH = "dateOfBirth";
    public static final String DATE_OF_BIRTH_FROM = "dateOfBirthFrom";
    public static final String DATE_OF_BIRTH_TO = "dateOfBirthTo";

    public static final String ANNIVERSARY_DATE = "anniversaryDate";
    public static final String ANNIVERSARY_DATE_FROM = "anniversaryDateFrom";
    public static final String ANNIVERSARY_DATE_TO = "anniversaryDateTo";
    public static final String WEDDING_DATE = "weddingDate";

    public static final String PAYMENT_DATE = "paymentDate";
    public static final String PAYMENT_DATE_FROM = "paymentDateFrom";
    public static final String PAYMENT_DATE_TO = "paymentDateTo";

    public static final String EXCHANGE_DATE = "exchangeDate";
    public static final String EXCHANGE_DATE_FROM = "exchangeDateFrom";
    public static final String EXCHANGE_DATE_TO = "exchangeDateTo";

    public static final String SCHEDULE_COMPLETION_DATE = "scheduleCompletionDate";
    public static final String SCHEDULE_COMPLETION_DATE_FROM = "scheduleCompletionDateFrom";
    public static final String SCHEDULE_COMPLETION_DATE_TO = "scheduleCompletionDateTo";

    public static final String DISB_DATE_FROM = "disbursementDateFrom";
    public static final String DISB_DATE_TO = "disbursementDateTo";

    public static final String DB_DATE = "yyyy-MM-dd HH:mm:ss";
    public static final String DB_DATETIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    public static final String DB_DATE_FORMAT_MMDDYY = "MMddyy";
    public static final String DB_DATE_FORMAT_YYMMDD = "yyMMdd";
    public static final String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
    public static final String MONTH_YEAR = "MMM-yyyy";
    public static final String DATE_MONTH_FORMAT = "MM-dd";
    public static final String YEAR_MONTH_FORMAT = "MM-yyyy";

    public static final String DATE = "dd-MM-yyyy";
    public static final String MONTH = "MM";
    public static final String YEAR = "yyyy";
    public static final String DAYS = "Days";
    public static final String MONTH_STR = "month";
    public static final String DAY_STR = "day";
    public static final String DAY_CLOSE_DATE = "Day Close Date";
    public static final String DAY_CLOSE_MODULE = "Day Close Module";
    public static final String CASHFORPURCHASE = "cashForPurchase";

    public static final String GOLD = "Gold";
    public static final String SILVER = "Silver";
    public static final String RECV_NETWEIGHT = "receivedNetWeight";
    public static final String RECV_PIECE = "receivedPieces";
    public static final String RECV_GROSSWEIGHT = "receivedGrossWeight";
    public static final String RECV_PURITY = "receivedPurity";
    public static final String RECV_PUREWEIGHT = "receivedPureWt";
    public static final String RECV_STONEWEIGHT = "receivedStoneWeight";
    public static final String RECV_TOUCH = "receivedTouch";
    public static final String RECV_THREAD = "receivedThreadWeight";
    public static final String ISSUE_WEIGHT = "issueWeight";
    public static final String SIZE = "SIZE";
    public static final String LENGTH = "LENGTH";
    public static final String WEIGHT_OF_ACTUAL = "weightOfactual";
    public static final String IS_PAID_DATE = "isPaidDate";
    public static final String SALES_DETAILS = "salesDetails";

//    Product code format
    public static final String PROD_CODE_ALPHANUM_SEQ = "ALPHANUMERIC_SEQ";
    public static final String PROD_CODE_ALPHANUM_RAND = "ALPHANUMERIC_RAND";
    public static final String PROD_CODE_NUM_SEQ = "NUMERIC_SEQ";
    public static final String PROD_CODE_NUM_RAND = "NUMERIC_RAND";

    public static final String HOME_PROD_PREFIX = "HP-";
    public static final String NON_TAG_PROD_PREFIX = "NTP-";

    // day close
    public static final String BRANCHID = "branchId";
    public static final String MODULE = "module";
    public static final String STATUSID = "statusId";
    public static final String REPAIR_STATUS = "repairStatus";
    public static final String STATUSID_ADV = "statusIdAdvW";
    public static final String STATUSID_ADV_WO = "statusIdAdvWO";
    public static final String NONTAG = "NONTAG";

    public static final String INV = "INVENTORY";

    public static final String OTP = "OTP";
    // ErrorStatus

    public static final String SUCCESS = "Success";
    public static final String YES = "Yes";
    public static final String NO = "No";
    public static final String RESPONSE_CODE_417 = "417";
    public static final String CREATION_FAILED_FOR = "Sorry Creation Failed for - ";
    public static final String CHIT_PAY_ERR_MSG = "Cannot Pay Twice A Month For Same Scheme";
    public static final String UNIQUE_DATA_EXCEPTION = "Unique Data Violation ";
    public static final String ENTER_UNIQUE_DATA = "Please Enter Unique Data, ";
    public static final String RANGE_ALREADY_EXISTS = "Range Already Exists in - ";
    public static final String RANGE_NAME_ALREADY_EXISTS = "Range Name Already Exists in - ";
    public static final String FILE_SIZE_EXCEEDED = "File Size Exceeds Maximum Limit 2 MB";
    public static final String UPDATION_FAILED_FOR = "Sorry Update Failed for Id - ";
    public static final String CREATION_FAILED_FOR_SEQNUM = "Sorry Creation Failed for SeqTypeList - ";
    public static final String EMP_ACCESS_TIME_ERR_MSG = "Employee Time Config Data Not Available";
    public static final String USER_ACC_EMP_ID_MSG = "Employee Should Not Null For Create User Account";
    public static final String DETAILS_NOT_FOUND_FOR = "Sorry Details Not Found for Id - ";
    public static final String ITEM_TRANSFER_FAILED_FOR = "Sorry Item Transfer Failed for - ";
    public static final String ITEM_TRANSFER_FAILED = "Item Transfer Failed";
    public static final String CREATION_FAILED = "Creation Failed";
    public static final String DURATION_OUT_OF_RANGE = "Duration Out Of Range";
    public static final String DURATION_OUT_OF_RANGE_DAYS = "Duration Out Of Range: Expected Maximum Duration - ";
    public static final String UPDATION_FAILED = "Update Failed";
    public static final String IMAGE_UPLOAD_FAILED = "There is a Problem Uploading Your Image, Image object is NULL";
    public static final String DETAILS_NOT_FOUND = "Details Not Found";
    public static final String NOT_VALID_STATUS = "Not a Valid Status";
    public static final String CHECK_PRODUCT_STATUS = "Please Check The Product Status. Cannot Delete It";
    public static final String USER_ACC_DOESNT_EXIST = "User Account Doesn't Exist";
    public static final String USER_CUST_ACC = "User Customer Account Available";
    public static final String ROLE_NOT_MAPPED = "User Roles Not Mapped !!";
    public static final String SERVER_ACCESS_ERR_MSG = "Server is not Accessible";
    public static final String SERVER_TIMING_ACCESS_ERR_MSG = "Server is not accessible during the non working hours";
    public static final String SERVER_ACCESS_SUCCESS_MSG = "Server is Accessible";
    public static final String CUSTOMER_ROLE_MISSING = "Role Missing for Customer";
    public static final String USER_ROLE_MISSING = "User Roles Missing !!";
    public static final String BANK_ACCOUNT = "Bank Account ";
    public static final String NOT_VALID_TRXN = "Not a Valid Transaction";
    public static final String BAD_CREDENTIAL = "Bad Credentials";
    public static final String SALE_DATA_NOT_FOUND = "No Data Found for the Sales";
    public static final String CHOOSE_VALID_PAYMENT_TYPE = "Its Not A Valid Payment Type";
    public static final String NEED_DEST_DTLS = "Need Destination Bank Account Details";
    public static final String IS_NOT_ACTIVE = "is Not Active";
    public static final String UNSUCCESSFUL_DELETE_MESSAGE = "Child datas has to be removed before deleting parent";
    public static final String ESTIMATION_EXCHANGE_NON_UNIQUE = "Cannot Create New Estimation Exchange For Existing Estimation. Please Create New Estimation";
    public static final String CANNOT_DELETE = "Cannot Delete. Please Delete Child Details";
    public static final String CANNOT_DELETE_FOR = "Cannot Delete Details for Id - ";
    public static final String SUCCESSFULLY_DELETED = "Record has been successfully deleted";
    public static final String EXP_CATE_INV_NOT_AVAILABLE = "Expense Category-Invoice is Not Available";
    public static final String CUSTOMER_DEATILS_NOT_FOUND = "Customer Details Not Found";
    public static final String USAGE_AMOUNT_ERR_MSG = "Usage Amount Should Not Greater Than 10000";
    public static final String CUSTOMER_CREDIT_DETAILS_NOT_FOUND = "Customer Credit Details Not Found";
    public static final String INVALID_CUSTOMER_VALUES = "Null or Invalid Customer Details";
    public static final String INVALID_MODULE_NAME = "Invalid module name";
    public static final String DATE_NOT_AVAILABLE_FOR = "Date Not Available For - ";
    public static final String RANGE_NOT_AVAILABLE = "Range Not Available For This Grossweight. Please Create New Range For This Grossweight";
    public static final String RANGE_NOT_AVLE_FOR = "Range Not Available For This ";
    public static final String VENDOR_TEMPLATE_NOT_AVAILABLE = "Vendor Template Not Available For This Grossweight. Please Create New Vendor Template For This Grossweight";
    public static final String STATUS_DISABLE = "Disable";
    public static final String WEIGHT_RANGE = "Weight Range ";
    public static final String SPECIFICATION = "Specification ";
    public static final String STATUS_ACTIVE = "Active";
    public static final String ALREADY_EXISTS = "Already Exists";
    public static final String META_WEIGHT_RANGE_VALUE_ERR = " StartValue Should Not Greater Than/EqualTo EndValue";
    public static final String STONE_RATETYPE_MISSING = "Stone Rate Type Missing !!";
    public static final String PROD_ORDER_PURCHASE_ERR = "Added Product Order Already Purchased";
    public static final String PAN_ERR_MSG = "Total Purchase Amount More Than 200000. Please Provide PAN Details";
    public static final String TRY_ANOTHER = "Try Another";
    public static final String LOT_SUMMARY_NOT_FOUND = "Lot Summary Details Not Found";
    public static final String CONSTRAINT_VIOLATION = "Constraint Violation : ";
    public static final String SUCCESSFULLY_UPDATED = "Updated Successfully";
    public static final String SALE_STR = "Sale";
    public static final String DETAILS_AVAILABLE = "Details Available";
    public static final String DISC_CALC_ERR_MSG = "Final Amount Should Not Greater Than Grand Total";
    public static final String LOT_ENTRY_NOT_AVAILABLE = "Lot Entry Details Not Available";
    public static final String LOT_SUMM_NOT_AVAILABLE = "Lot Summary Details Not Available";
    public static final String PRODUCT_NOT_AVAILABLE = "Product Details Not Available";
    public static final String USER_ACC_ALREADY_EXIST = "User Name is Already Available. Please SignUp With Another Name";
    public static final String EMP_CODE_SEQ_CREATE_ERR = "Can't create employee code with prefix ";
    public static final String EMP_CODE_SEQ_UPDATE_ERR = "Can't update employee code with prefix ";
    public static final String INV_LOT_ITEM_NOT_AVAILABLE = "Inventory Lot Item Details Not Available";
    public static final String INV_LOT_SUMM_NOT_AVAILABLE = "Inventory Lot Summary Details Not Available";
    public static final String VENDOR_TRXN_UPDATE_MSG = "More Transaction Available. Cannot Update Vendor ProductType and CreditDebit Details";
    public static final String SERVER_ACCESS_IP_ERR_MSG = "Server Access IP Data Not Available";
    public static final String UNAUTH_IP_ERR_MSG = "UnAuthorised IP ";
    public static final String PROD_CODE_APP_CONFIG_ERR_MSG = "App-Config Not Available For Product Code Format";
    public static final String SUB_CATE_SHORT_CODE_ERR_MSG = "Subcategory Short Code is Not Valid For ";
    public static final String BOOKING_FAILED_STS = "Booking Failed. Product Not Available";
    public static final String BOOKING_FAILED_DEMOSTATUS = "Booking Failed. Invalid Demo Status";
    public static final String CANNOT_DELETE_EXCH_SEGREGATED = "Cannot Delete. Exchange Item is Segregated";
    public static final String CANNOT_DELETE_PROD_SEGREGATED = "Cannot Delete. Product is Segregated";
    public static final String CANNOT_DELETE_SALEITEM_SEGREGATED = "Cannot Delete. Sale Item is Segregated";
    public static final String EXCH_TRANSFER_ERR_MSG = "Not Enough Available Weight To Transfer";
    public static final String CHIT_PAY_ENROLL_STS_ERR_MSG = " is Not Active Chit";
    public static final String BAL_MELT_LOT = "BalanceMeltingLot";
    public static final String BAL_MELT_LOT_TO_MELTING = "BalanceMeltingLotToMelting";
    public static final String BAL_MELT_LOT_TO_RETAG = "BalanceMeltingLotToRetag";
    public static final String INVALID_PROD_ORDER = "Null or Invalid Product Order Details";
    public static final String OTP_MSG = " is the OTP. Do not share this with anyone";
    //
    public static final String MALFORMED_URL_EXCEPTION = "Malformed URL Exception : ";
    public static final String JPA_OBJ_RETRIEVAL_EXCEPTION = "Jpa Object Retrieval Failure : ";
    public static final String ENTITY_NOT_FOUND_EXCEPTION = "Entity Not Found : ";
    public static final String NUMBER_FORMAT_EXCEPTION = "Number Format Exception : ";
    public static final String IO_EXCEPTION = "IO Exception : ";
    public static final String PARSE_EXCEPTION = "Parse Exception : ";
    public static final String CLASS_MISMATCH_EXCEPTION = "ClassMismatch Exception : ";
    public static final String MALFORMED_JSON_EXCEPTION = "MalformedJson Exception : ";
    public static final String ARRAYINDEX_OUTOFBOUND_EXCEPTION = "ArrayIndexOutOfBound Exception : ";
    public static final String CLASS_CAST_EXCEPTION = "ClassCast Exception : ";
    public static final String ARITHMETIC_EXCEPTION = "Arithmetic Exception : ";
    public static final String JSON_MAPPING_EXCEPTION = "JsonMapping Exception : ";
    public static final String JSON_PARSE_EXCEPTION = "JsonParse Exception : ";
    public static final String JSON_SYNTAX_EXCEPTION = "JsonSyntax Exception : ";
    public static final String DATA_INTEGRITY_EXCEPTION = "DataIntegrityViolation Exception :";
    public static final String CONSTRAINT_VIOLATION_EXCEPTION = "ConstraintViolation Exception : ";
    public static final String HTTP_MESSAGE_NOT_READABLE_EXCEPTION = "Http Message Not Readable : ";
    public static final String EXPIRED_JWT_EXCEPTION = "Expired Jwt Exception : ";

    public static final String NPE = "Null Pointer Exception : ";
    public static final String UNIQUE_MANDATORY_MSG = "Could be a Unique / Mandatory Value Violation , plz check the data entered";
    public static final String EMAIL_MSG_EXCEPTION = "Sorry, Could not send Email";
    public static final String PIECE_NOT_ENOUGH = "Not Enough Pieces To Inward This Product In ";
    public static final String GROSS_WEIGHT_NOT_ENOUGH = "Not Enough Gross Weight To Inward This Product In";
    public static final String NET_WEIGHT_NOT_ENOUGH = "Not Enough Net Weight To Inward This Product In ";
    public static final String DATA_NOT_AVAILABLE = "Details Not Available ";
    public static final String NO_DEFAULT_BRANCH = "No Default Branch Configured ";
    public static final String RSGN_DISABLE = "resignationDisable";
    public static final String INVALID_PRODUCT = "Null or Invalid Product ";
    public static final String NOT_PARTLY_SALE_PRODUCT = " is Not Partly Sale Product.";
    public static final String BALANCE_WEIGHT_EQUAL_ZERO = " Balance Weight is Less Than Or EqualTo Zero";
    public static final String ALREADY_SOLD = " is a Sold Product. You Cannot Sell Again";
    public static final String ALREADY_USED_ADVANCE = "Advance Already Used";
    public static final String CUST_CREDIT_DLT = "Already Used. You Cannot Delete Customer Credit Details";
    public static final String QUANTITY_NOT_ENOUGH = "Not Enough Product To Sale";
    public static final String INVALID_PRODUCT_MSG = "Null or Invalid Product. Please Select Valid Product";
    public static final String SALES_ISSUE = "Sorry!!! Cannot Sale This Product - ";
    public static final String PRODUCT_SALES_DATE_MSG = "Product Inwarded After Sales Date";
    public static final String PRODUCT_DATE_ISSUE_MSG = "Product Inwarded Date Greater Than Dayclose Date";
    public static final String LOTENTRY_DATE_ISSUE_MSG = "Lot Entry Date Ahead Of Lot Summary Dayclose Date";
    public static final String LOT_SUMM_DATE_ISSUE_MSG = "Lot Summary Date Ahead Of Product Dayclose Date";
    public static final String CUSTOMER_CREATED_AT_SALES = "Customer Created Date Ahead Of Sales Dayclose Date";
    public static final String CUSTOMER_ENROLL_SALES = "Customer Enrollment Date Ahead Of Sales Dayclose Date";
    public static final String SALES_EDIT_ISSUE = "Sorry!!! Cannot Edit This Sale. Sale is Not Created Today";
    public static final String CHIT_DISBURSEMENT = "Chit Disbursement";
    public static final String CUSTOMER_ADVANCE = "Customer Advance";
    public static final String CHIT_DISBURSEMENT_CREATED_AT_SALES = "Chit Disbursement Created Date Ahead Of Sales Dayclose Date";
    public static final String CHIT_DISBURSEMENT_DATE_SALES = "Chit Disbursement Date Ahead Of Sales Dayclose Date";
    public static final String CHIT_ENROLL_CREATED_AT_SALES = "Chit Enrollment Created Date Ahead Of Sales Dayclose Date";
    public static final String CHIT_ENROLL_DATE_SALES = "Chit Enrollment Date Ahead Of Sales Dayclose Date";
    public static final String CUSTOMER_CREDIT_CREATED_AT_SALES = "Customer Advance Created Date Ahead Of Sales Dayclose Date";
    public static final String CUSTOMER_CREDIT_DATE_SALES = "Customer Advance Credit Date Ahead Of Sales Dayclose Date";
    public static final String CUSTOMER_CREDIT_CREATED_AT_CHIT = "Customer Advance Created Date Ahead Of Chit Dayclose Date";
    public static final String CUSTOMER_CREDIT_DATE_CHIT = "Customer Advance Credit Date Ahead Of Chit Dayclose Date";
    public static final String DATA_INTEGRITY_VIOLATION = "Cannot create unique Sequence Number";
    public static final String REFERRER_DETAILS_NOT_FOUND = "Referrer Details Not Found";
    public static final String UPDATED_CREDIT_VALUE = "Updated Customer Credit Value for - ";
    public static final String UPDATED_CHIT_VALUE = "Updated Customer Chit Value for - ";
    public static final String NOT_ACTIVE_CHIT = " is Not Active Chit";
    public static final String SELECT_CATEGORY = "Please Choose Proper Category";
    public static final String CATEGORY_NOT_AVAILABLE = " Category is Not Available";
    public static final String CHIT_ENROLL_CREATED_AT_CHIT_PAYMENT = "Chit Enrollment Created Date Ahead Of SavingScheme Dayclose Date";
    public static final String CHIT_ENROLL_DATE_CHIT_PAYMENT = "Chit Enrollment Date Ahead Of SavingScheme Dayclose Date";
    public static final String CUSTOMER_CREDIT_CREATED_AT_RCPT = "Customer Advance Created Date Ahead Of Receipt Dayclose Date";
    public static final String CUSTOMER_CREDIT_DATE_RCPT = "Customer Advance Credit Date Ahead Of Receipt Dayclose Date";
    public static final String CHIT_DISBURSEMENT_CREATED_AT_RCPT = "Chit Disbursement Created Date Ahead Of Receipt Dayclose Date";
    public static final String CHIT_DISBURSEMENT_DATE_RCPT = "Chit Disbursement Date Ahead Of Receipt Dayclose Date";
    public static final String CHIT_ENROLL_CREATED_AT_RCPT = "Chit Enrollment Created Date Ahead Of Receipt Dayclose Date";
    public static final String CHIT_ENROLL_DATE_RCPT = "Chit Enrollment Date Ahead Of Receipt Dayclose Date";
    public static final String EXP_CATE_INV_PAYMENT = "Invoice Payment";
    public static final String MANDATORY = " is Mandatory";
    public static final String BRANCH_DTLS = "Branch Details";

    // status
    public static final String ADVANCE_WITH_DELIVERY = "Advance_With_Delivery";
    public static final String ADVANCE_WITHOUT_DELIVERY = "Advance_Without_Delivery";
    public static final String HOME_PRODUCT = "Home_Product";
    public static final String SALES = "Sales";
    public static final String ADV_FRM_PREV_ADV = "Adjusted_From_Prev_Adv";
    public static final String CHIT_CUSTOMER_PYMNT = "Chit_Customer_Payment";
    public static final String ADV_AFTER_CHIT_ADJT = "Adv_After_Chit_Payment_Adjt";
    public static final String ADV_AFTER_INV_PYMT_ADJT = "Adv_After_Inv_Payment_Adjt";
    public static final String ADV_AFTER_PAR_RFD_ADJT = "Adv_After_PartialRefund_Adjt";
    public static final String ADV_FROM_PROD_ORDER = "Adv_From_Prod_Order";

    public static final String PROD_ADVANCE = "Product_Advance";
    public static final String DIRECT_ADVANCE = "Direct_Advance";
    public static final String MANUAL_TRXN = "Manual_Trxn";
    public static final String IN_PERSON_TRXN = "IN_PERSON_TRXN";
    public static final String EXCH_STR = "Exchange";
    public static final String SALE_ID_SEQ = "SALE_ID";
    public static final String GIFT_SALE_ID_SEQ = "GIFT_ARTICLE_SALE_ID";
    public static final String EXCHANGE_ID_SEQ = "EXCHANGE";
    public static final String EXPENSES_ID_SEQ = "EXPENSES";
    public static final String RECEIPT_ID_SEQ = "RECEIPT";
    public static final String CUSTOMER_CREDIT_ID_SEQ = "CUSTOMER_CREDIT_ID";
    public static final String ESTIMATION_STATUS = "estimation";
    public static final String CHIT_ENROLL_STATUS = "chitEnrollStatus";
    public static final String NOT_EQUAL_CATE_INVOICE = "notEqualInvCate";
    public static final String EXP_CATEGORY = "expCategory";
    public static final String CHIT_VISIBILITY_STATUS = "chitVisibilityStatus";
    public static final String VISIBILITY_STATUS = "visibilityStatus";
    public static final String SOLD_STATUS = "Sold";
    public static final String RETURN_STATUS = "Return";
    public static final String TRANSFERRED_STATUS = "Transferred";
    public static final String VENDOR_RETURN = "Vendor_Return";
    public static final String DAMAGED_STATUS = "Damaged";

    public static final String TRANSIT_INITIATED = "Transit Initiated";
    public static final String TRANSIT_RECEIVED = "Transit Received";
    public static final String TRANSIT_CANCELLED = "Transit Cancelled";
    public static final String TRANSIT_APPROVED = "Transit Approved";

    public static final String NON_TAG_PRODUCT = "NON_TAG_PRODUCT";

    public static final String STONE = "stone";
    public static final String TYPEID = "typeId";

    public static final String PRODUCT_MISC = "product_misc";
    public static final String INVENTORY = "inventory";
    public static final String INVENTORY_CAPS = "Inventory";
    public static final String EMPTY_ARRAY = "[]";
    public static final String NOT_APPLICABLE = "N/A";
    public static final String NOT_AVAILABLE = "NotAvailable";
    public static final String SALE_PAN_REF = "Pan Card:";
    public static final String SALE_GSTIN_REF = "GSTIN:";
    public static final String LOT_ENTRY = "lot_entry";
    public static final String LOT_SEQ_NUM = "lotSeqNum";
    public static final String INV_LOTITEM_SEQ_NUM = "invLotItemSeqNum";
    public static final String SEQ_NUM = "seqNum";
    public static final String LOT_ENTRY_TEXT = "Lot Entry";
    public static final String LOT_SUMMARY_TEXT = "Lot Summary";
    public static final String LOT_SUMMARY_ID = "lotSummaryId";
    public static final String LOT_ENTRY_ID = "lotEntryId";
    public static final String COMBINED_PCS = "combinedPcs";
    public static final String COMBINED_GW = "combinedGrossWt";
    public static final String COMBINED_NW = "combinedNetWt";
    public static final String DIAMOND = "DIAMOND";

//  ProductRate Rate Updated Source

    public static final String AUTO = "AUTO";

    public static final String WEB = "WEB";

    public static final String MOBILE_STR = "MOBILE";

    // priceCalculation

    public static final String UNIT_RS = "rs";
    public static final String UNIT_MG = "mg";
    public static final String UNIT_GM = "gm";
    public static final String TYPE_FLAT = "flat";
    public static final String TYPE_PERGM = "pergm";
    public static final String TYPE_PERCARAT = "percarat";
    public static final String PER_PIECE = "pieces";
    public static final String STONECOST_TYPE_GRMS = "Grms";
    public static final String STONECOST_TYPE_CARAT = "Carat";
    public static final String OTHERCHARGE_TYPE_FLAT = "Flat";
    public static final String OTHERCHARGE_TYPE_PERCENTAGE = "Percentage";
    public static final String OTHERCHARGE_TYPE_PIECES = "Pieces";
    public static final String OTHERCHARGE_TYPE_PER_GRAM = "Pergram";
    public static final String ROUGH_CALCULATION = "RoughCalculation";
    public static final String STONE_GRM = "grm";
    public static final String DATA_NAME = "dataName";
    public static final String STONE_DESCRIPTION = "stoneDescription";
    public static final String NO_WASTAGE = "NO_WASTAGE";
    public static final String NO_MAKING_CHARGE = "NO_MAKING_CHARGE";
    public static final String NO_WASTAGE_AND_MC = "NO_WASTAGE_AND_MC";

    // filter
    public static final String ID = "id";
    public static final String SALES_ID = "salesId";
    public static final String SALE_ID = "saleId";
    public static final String NAME = "name";
    public static final String MOBILE = "mobile";
    public static final String ADDRESS1 = "address1";
    public static final String ADDRESS2 = "address2";
    public static final String TOTAL_AMT = "totalAmt";
    public static final String TOTAL_AMT_FROM = "totalAmtFrom";
    public static final String TOTAL_AMT_TO = "totalAmtTo";
    public static final String EXCHANGE_AMT = "exchangeAmount";
    public static final String EXCHANGE_AMT_FROM = "exchangeAmountFrom";
    public static final String EXCHANGE_AMT_TO = "exchangeAmountTo";
    public static final String AMOUNT = "amount";
    public static final String CHIT_ENROL = "Chit Enrollment ";
    public static final String AMOUNT_FROM = "amountFrom";
    public static final String AMOUNT_TO = "amountTo";
    public static final String USERNAME = "username";
    public static final String NEXT_PAIDDATE = "nextPaidDate";
    public static final String PAID_AMOUNT = "paidAmount";
    public static final String PAID_AMOUNT_FROM = "paidAmountFrom";
    public static final String PAID_AMOUNT_TO = "paidAmountTo";
    public static final String PENDING_AMOUNT = "pendingAmount";
    public static final String PENDING_PIECES = "pendingPieces";
    public static final String RECEIVED_AMOUNT = "receivedAmount";
    public static final String BILL_DATE = "billDate";
    public static final String SOLDTO = "soldTo";
    public static final String SALE_ITEM = "SaleItem";
    public static final String INVOICE = "invoice";
    public static final String CREATEDBY = "createdBy";
    public static final String STATUS = "status";
    public static final String PRODUCT_CODE = "productCode";
    public static final String REMOVE_NTP = "removeNTP";
    public static final String REMOVE_HP = "removeHP";
    public static final String PRODUCT_ID = "productId";
    public static final String PIECE = "piece";
    public static final String INVOICE_DATE = "invoiceDate";
    public static final String PRODUCT_NAME = "productName";
    public static final String DESCRIPTION = "description";
    public static final String USED = "Used";
    public static final String USED_UC = "USED";
    public static final String TRANSFERED_FROM_INV = "TransferedFromInventory";
    public static final String TRANSFERED_FROM_EXCH = "TransferedFromExchange";
    public static final String PROD_DESC_INVENTORY = "prodDescInventory";
    public static final String PROD_DESC_EXCHANGE = "prodDescExchange";
    public static final String ENROLL_COUNT = "enrollmentCount";
    public static final String TRANSACTION_MODE = "transactionMode";
    public static final String BASE_PRICE = "basePrice";
    public static final String TAX_COL = "tax";
    public static final String DISCOUNT = "discount";
    public static final String WASTAGE = "wastage";
    public static final String MELTING_LC = "melting";
    public static final String EXCH_MELTING_ID = "exchMeltingId";
    public static final String PROD_MELTING_ID = "prodMeltingId";
    public static final String SALEITEM_MELTING_ID = "saleItemMeltingId";
    public static final String MELTING_LEDGER_ID = "meltingLedgerId";
    public static final String EXCH_ITEM_ID = "exchangeItemId";
    public static final String PROD_ID = "productId";
    public static final String SALE_ITEM_ID = "saleItemId";
    public static final String QUALITY_LC = "quality";
    public static final String SRC_REFER = "sourceReference";
    public static final String MELTING_SEQ_NUM = "meltingSeqNum";
    public static final String STANDARDIZATION_LC = "standardization";
    public static final String MTL_TRXN_SEQ_NUM = "metalTrxnSeqNum";
    public static final String MTL_DIFF_SEQ_NUM = "metalDiffSeqNum";
    public static final String MELTING_UC = "Melting_Ledger";
    public static final String MTL_DIFF_PROD_ID = "productId";
    public static final String QUALITY_UC = "Metal_Quality_Analysis";
    public static final String STANDARDIZATION_UC = "Standardization_Ledger";
    public static final String PRODUCT_SPEC = "productSpecification";
    public static final String REORDER_SPEC = "reorderSpecification";
    public static final String PURCHASE_TYPES = "purchaseTypes";
    public static final String LOT_SUMMARY_BRANCH = "lotSummaryBranch";

    public static final String SUBCATEGORY_NAME = "subCategoryName";
    public static final String CATEGORY_NAME = "categoryName";
    public static final String SUBCATEGORY_STR = "Subcategory";
    public static final String SALES_COL = "sales";
    public static final String SALES_WEIGHT = "salesWeight";
    public static final String FROM_WEIGHT = "fromWeight";
    public static final String TO_WEIGHT = "toWeight";
    public static final String MIN_WEIGHT = "minWeight";
    public static final String MAX_WEIGHT = "maxWeight";
    public static final String DISC_AMOUNT = "discountAmount";
    public static final String DISC_AMOUNT_FROM = "discountAmountFrom";
    public static final String DISC_AMOUNT_TO = "discountAmountTo";
    public static final String DISC_PERC = "discountPercentage";
    public static final String DISC_PERC_FROM = "discountPercentageFrom";
    public static final String DISC_PERC_TO = "discountPercentageTo";
    public static final String GENERATED_DATE = "generatedDate";
    public static final String GENERATED_DATE_FROM = "generatedDateFrom";
    public static final String GENERATED_DATE_TO = "generatedDateTo";
    public static final String AVAIL_GW_FROM = "availGWFrom";
    public static final String AVAIL_GW_TO = "availGWTo";
    public static final String VALID_TILL = "validTill";
    public static final String VALID_TILL_FROM = "validTillFrom";
    public static final String VALID_TILL_TO = "validTillTo";
    public static final String VALID_FROM = "validFrom";
    public static final String VALID_TO = "validTo";
    public static final String EMPLOYEEID = "employeeId";
    public static final String AVAIL_WEIGHT_AFTER_PROCESS = "availableWeightAfterProcess";
    public static final String APPROVAL_STATUS = "approvalStatus";
    public static final String APPROVAL_PENDNIG = "Approval_Pending";

    public static final String VENDOR_NAME = "vendorName";
    public static final String VENDOR_NAME_STR = "VendorName";
    public static final String VENDOR_TYPE_SMITH = "Smith";
    public static final String VENDOR_MTLTOMTL_PREFIX = "VMM";
    public static final String RCVD_MTLTOMTL_PREFIX = "RMM";
    public static final String RCVD_MTLTOORNAMENT_PREFIX = "RMO";
    public static final String PURCHASE_INV_STR = "Purchase_Invoice";
    public static final String PURCHASE_STR = "Purchase";
    public static final String VENDOR_MTL_STR = "Vendor_Mtl_To_Mtl";
    public static final String VENDOR_ORNAMENT_STR = "Vendor_Mtl_To_Ornament";
    public static final String RCVD_MTL_STR = "Received_Mtl_To_Mtl";
    public static final String DIRECT_EXPENSES = "Direct_expenses";
    public static final String DIRECT_RECEIPT = "Direct_receipt";
    public static final String SALE_RECEIPT = "Sale_receipt";
    public static final String EXPENSES_STR = "Expenses";
    public static final String RECEIPT_STR = "Receipt";
    public static final String RECEIVED = "Received";
    public static final String CONFIRMED = "Confirmed";
    public static final String RCVD_ORNAMENT_STR = "Received_Mtl_Ornament";
    public static final String EMAIL = "email";
    public static final String TOTAL_AMOUNT = "totalAmount";
    public static final String TOTAL_AMOUNT_FROM = "totalAmountFrom";
    public static final String TOTAL_AMOUNT_TO = "totalAmountTo";
    public static final String TOTAL_INVOICE = "totalInvoice";
    public static final String TOTAL = "total";
    public static final String PRODUCTTYPE = "productType";
    public static final String EXCH_PRODUCTTYPE = "exchProductType";
    public static final String EXCH_ITEM_BRANCH = "exchItemBranch";
    public static final String SALE_ITEM_BRANCH = "saleItemBranch";
    public static final String SALE_ITEM_PRODUCTTYPE = "saleItemProductType";
    public static final String EXCH_PRODUCTCATE = "exchProductCate";
    public static final String EXCH_PRODUCT_SUBCATE = "exchProductSubcate";
    public static final String PROD_CATE_STR = "productCategory";
    public static final String EXCH_GW_FROM = "exchGrossWeightFrom";
    public static final String EXCH_GW_TO = "exchGrossWeightTo";
    public static final String EXCH_NW_FROM = "exchNetWeightFrom";
    public static final String EXCH_NW_TO = "exchNetWeightTo";
    public static final String PRODUCTTYPE_NAME = "productTypeName";
    public static final String PURCHASE_INV_COUNT = "purchaseInvoiceCount";
    public static final String PRODUCTTYPE_ID = "productTypeId";
    public static final String PRODUCT_ORDER = "Product Order ";
    public static final String PRODUCT_NAME_COL = "Product ";
    public static final String EVALUATION_DETAIL = "evaluationDetails";
    public static final String ACCEPTED_METAL_RATE = "acceptedMetalRate";
    public static final String CREDIT_DAYS = "creditdays";
    public static final String CREDIT_DATE = "Credit Date";
    public static final String CREDIT_VALUE_STR = "Credit_Value";
    public static final String DEBIT_VALUE_STR = "Debit_Value";
    public static final String QUANTITY = "quantity";
    public static final String INV_PURCHASE_ITEM_QTY = "invPurchaseItemQty";
    public static final String CHIT_TYPE = "chitTypeId";
    public static final String CHIT_TYPE_COL = "chitType";
    public static final String ACC_HOLDER_NO = "accHolderNumber";
    public static final String BRANCH_NAME = "branchName";

    public static final String DISB_AMOUNT = "disbursementAmount";
    public static final String DISB_ID = "disbursementId";
    public static final String BILL_NO_STR = "billNo";
    public static final String DISB_GRM = "disbursementGrms";
    public static final String DISB_DATE = "disbursementDate";
    public static final String OFFER_AMOUNT = "offerAmount";
    public static final String CHIT_ID = "chitId";
    public static final String VENDOR_ID = "vendorId";
    public static final String PRODUCTDETAIL = "productDetails";
    public static final String SHORTCODE = "shortCode";
    public static final String REPAIR_NO = "repairNo";
    public static final String REPAIR_ID = "repairId";

//    Automatic Metal Rate Updation
    public static final String GOLDRATE_24CT_1GM = "goldrate_24ct";
    public static final String GOLDRATE_22CT_1GM = "goldrate_22ct";
    public static final String SILVERRATE_1GM = "silverrate_1gm";
    public static final String GOLD_STR = "Gold";
    public static final String SILVER_STR = "Silver";
    public static final String GOLD_PURITY_24CT = "24K - 99.9%";
    public static final String GOLD_PURITY_22CT = "22K - 91.6%";
    public static final String SILVER_PURITY_90 = "90%";

    public static final String ACTUAL_AMT = "actualAmount";
    public static final String EXPECTED_AMT = "expectedAmount";
    public static final String BAL_AMT = "balanceAmount";
    public static final String BAL_NET_WEIGHT = "balanceNet";
    public static final String BAL_GROSS_WEIGHT = "balanceGross";
    public static final String BAL_AMT_FROM = "balanceAmountFrom";
    public static final String BAL_AMT_TO = "balanceAmountTo";
    public static final String CUSTOMER_COL = "customer";
    public static final String BRANCH_COL = "branch";
    public static final String ORDER_ID = "orderId";
    public static final String RECEIVED_TYPE = "receivedType";
    public static final String CATEGORY = "category";
    public static final String STORE_DETAIL = "storeDetails";
    public static final String WEIGHT_DETAIL = "weightDetails";
    public static final String CORPORATE_NAME = "corporateName";
    public static final String CHIT_METADATA = "chitMetadata";
    public static final String TYPE = "type";
    public static final String PURITY_ID = "purityId";
    public static final String OTHER_CHARGE = "otherCharges";
    public static final String OPEN_BALANCE = "OpeningBalance";
    public static final String SEC_METAL = "secMetalDetails";
    public static final String INVOICENO = "invoiceNo";
    public static final String SECTION_ID = "sectionId";
    public static final String SECTION_NAME = "sectionName";
    public static final String SECTION_DETAILS = "sectionDetails";
    public static final String ORDERSTATUS_NAME = "orderStatusName";
    public static final String PURITY_COL = "purity";
    public static final String SOLDBY = "soldBy";
    public static final String CHIT_AMOUNT = "chitAmount";
    public static final String PAYMENT_AMOUNT = "paymentAmount";
    public static final String PAYMENT_MODE = "paymentMode";
    public static final String DUE = "dueNumber";
    public static final String PAYMENT_TYPE = "paymentType";
    public static final String CUSTOMER_STR = "Customer";
    public static final String PAYMENT_GRM = "paymentGrms";
    public static final String ENROLLMENT_DATE = "enrollmentDate";
    public static final String PAYMENT_REC_AMT = "paymentReceiptAmount";
    public static final String PAYMENT_REC_GRM = "paymentReceiptGrms";
    public static final String DISB_REC_AMOUNT = "disbursementReceiptAmount";
    public static final String DISB_REC_GRM = "disbursementReceiptGrms";
    public static final String CR_VALUE = "creditValue";
    public static final String CR_VALUE_ZERO = "creditValueZero";
    public static final String DR_VALUE_ZERO = "debitValueZero";
    public static final String DR_VALUE = "debitValue";
    public static final String FLOOR_NO = "floorNumber";
    public static final String AUDIT_DETAIL = "auditDetails";
    public static final String FLOOR_ID = "floorId";
    public static final String AUDIT_TAGID = "auditTagId";
    public static final String FLAG = "availabilityFlag";
    public static final String TYPE_NAME = "typeName";
    public static final String STATUS_NAME = "statusName";
    public static final String AUDIT_NAME = "auditName";
    public static final String EMPLOYEE_NAME = "employeeName";
    public static final String EMPLOYEE_STR = "Employee";
    public static final String SEQNO = "seqNum";
    public static final String PAYMENT_DETAIL = "paymentDetails";
    public static final String IS_DEFAULT = "isDefault";
    public static final String USAGE_AMT = "usageAmount";
    public static final String USAGE_AMT_FROM = "usageAmountFrom";
    public static final String USAGE_AMT_TO = "usageAmountTo";
    public static final String RCVD_TYPE_MTL = "receivedTypeMetal";
    public static final String RCVD_TYPE_ORNAMENT = "receivedTypeOrnament";
    public static final String PRIORITY = "priority";
    public static final String ORNAMENT = "Ornament";
    public static final String ISSUE_BALANCE_DETAILS = "issueBalanceDetails";
    public static final String METAL = "Metal";
    public static final String RCVD_DETAILS = "receivedDetails";
    public static final String REPAIR_RECV_DATE = "repairReceivedDate";
    public static final String RECV_DATE = "receivedDate";
    public static final String RECV_DATE_FROM = "receivedDateFrom";
    public static final String RECV_DATE_TO = "receivedDateTo";
    public static final String INWARD_DATE = "inwardDate";
    public static final String INWARD_DATE_FROM = "inwardDateFrom";
    public static final String INWARD_DATE_TO = "inwardDateTo";
    public static final String BILL_NO = "billNumber";
    public static final String USAGE = "usage";
    public static final String CREDITBILL_NO = "bill_no";
    public static final String CREDIT_VAL = "creditVal";
    public static final String DIFF_CATE = "d_category";
    public static final String REF_ID = "ref_id";
    public static final String CREDIT_VALUE = "creditValue";
    public static final String DEBIT_VAL = "debitVal";
    public static final String DEBIT_VALUE = "debitValue";
    public static final String CREDIT_LC = "credit";
    public static final String CREDIT_VALUE_OLD = "Credit Value";
    public static final String DEBIT_LC = "debit";
    public static final String USAGE_VALUE = "usage_value";
    public static final String TAX_DETAIL = "taxDetails";
    public static final String RECD_WT_DETAIL = "receivedWeightDetails";
    public static final String COM_DETAIL = "commissionDetails";
    public static final String RECD_PROD_TYPE = "receivedProductType";
    public static final String PROD = "product";
    public static final String PROD_UC = "Product";
    public static final String TOTAL_RATE = "totalRate";
    public static final String RATE = "rate";
    public static final String CASH_RATE = "cashRate";
    public static final String COIN_RATE = "coinRate";
    public static final String EXCHANGE_RATE = "exchangeRate";
    public static final String EXCHANGE_TOTAL = "exchangeTotal";
    public static final String PURITY_CONVERSION = "purityConversion";
    public static final String TRANSFERED_ITEM = "TransferedItem";
    public static final String DEALER_DETAIL = "dealerDetails";
    public static final String DEALER = "Dealer";
    public static final String DEALER_COL = "dealer";
    public static final String INSTALLMENT = "Installment - ";
    public static final String OPEN_PARENTHESES = "(";
    public static final String CLOSE_PARENTHESES = ")";
    public static final String EXPECTED_DATE = "expectedDate";
    public static final String RFID_DETAIL = "rfidDetail";
    public static final String RFID_STATUS_NEW = "New";
    public static final String RFID_STATUS_MAPPED = "Mapped";
    public static final String COUNTRY_STR = "country";
    public static final String STATE_STR = "state";
    public static final String DISTRICT_STR = "district";
    public static final String TALUK_STR = "taluk";
    public static final String PINCODE_STR = "pincode";
    public static final String ZONE_STR = "zone";
    public static final String COUNTY_STR = "county";
    public static final String VALUE = "value";
    public static final String RETURN_TYPE = "returnType";
    public static final String SALE_TYPE = "saleType";
    public static final String RETURN_CASH = "Return Cash";
    public static final String RETURN_AMOUNT = "returnAmount";
    public static final String EXCHANGE_ADVANCE = "Exchange_advance";
    public static final String ADJUSTED_AMOUNT = "adjusted_amount";
    public static final String PAYABLE_AMOUNT = "payableAmount";
    public static final String COMPLETED = "Completed";
    public static final String DELIVERED = "Delivered";
    public static final String DELETE = "Delete";
    public static final String SAVING_SCHEME = "savings_scheme";
    public static final String AUDIT_SECTION = "auditSection";
    public static final String AUDIT_CATEGORY = "auditCategory";
    public static final String RFID_TAGNO = "rfidTagNumber";
    public static final String TAX_TEXT = "taxDetailsText";
    public static final String TAX_VALUE = "taxDetailsValue";
    public static final String APPROVED_BY = "approvedBy";
    public static final String INR = "INR";
    public static final String GIFT_VALUE_START_RANGE = "giftValueStartRange";
    public static final String GIFT_VALUE_END_RANGE = "giftValueEndRange";
    public static final String CASH_GIFT_START_RANGE = "cashGiftStartRange";
    public static final String CASH_GIFT_END_RANGE = "cashGiftEndRange";
    public static final String MTL_RATE_START_RANGE = "mtlRateStartRange";
    public static final String MTL_RATE_END_RANGE = "mtlRateEndRange";
    public static final String NEUTRAL = "Neutral";
    public static final String POSITIVE = "Positive";
    public static final String NEGATIVE = "Negative";
    public static final String RETURN_SALE = "Return_Sale";
    public static final String AVAILABLE = "Available";
    public static final String MISSING = "Missing";
    public static final String UNMAPPED = "Un-Mapped / Product-Sold";
    public static final String FLOOR_NAME = "Floor Name";
    public static final String SERVER_ACCESS_IP = "server_access_ip";
    public static final String IP_AUTH_FLAG = "is_ipauth_enabled";
    public static final String IP_AUTH_FLAG_CONFIG = "ipAuthFlag";

    public static final String CUSTOMERID = "customerId";
    public static final String CUSTOMERNAME = "customerName";
    public static final String CASHTYPE = "cashType";
    public static final String BULLION = "Bullion";
    public static final String AMOUNT_FOR_WEIGHT = "amountForWeight";
    public static final String EXCH = "Exchange";
    public static final String BARGOLD_CAL = "barGoldCal";
    public static final String OVERALL_VAT = "overAllVat";

//    Filter
    public static final String CHIT_CUSTOMER_FILTER = "chitCustomer";
    public static final String CHIT_APPROVED_FILTER = "chitApprovedStatus";
    public static final String RCVD_DATE_STATUS = "receivedDateStatus";
    public static final String VENDOR_STATUS = "vendorStatus";
    public static final String APPROVED = "Approved";
    public static final String NOT_APPROVED = "Not_approved";
    public static final String CHIT_PAYMENT_ID = "chitPaymentId";
    public static final String SOLD_GIFT_TYPE = "soldGiftProductType";
    public static final String SOLD_GIFT_CATE = "soldGiftProductCate";
    public static final String SOLD_GIFT_SUBCATE = "soldGiftProductSubcate";
    public static final String CHIT_DISB_CUSTOMER = "chitDisbCustomer";
    public static final String CHIT_DISB_ID = "chitDisbId";
    public static final String CHIT_DISB_STATUS = "chitDisbStatus";
    public static final String SOLD_GIFT_PROD_CODE = "soldGiftProductCode";
    public static final String SOLD_GIFT_PROD_NAME = "soldGiftProductName";
    public static final String SOLD_GIFT_BRANCH = "soldGiftBranch";
    public static final String SALE_ITEM_CUSTOMER = "saleItemCustomer";
    public static final String STOCK_TRFR_PRODUCT_TYPE = "stockTransferType";
    public static final String STOCK_TRFR_PRODUCT_CATE = "stockTransferCate";
    public static final String STOCK_TRFR_PRODUCT_SUBCATE = "stockTransferSubcate";
    public static final String STOCK_TRFR_PRODUCT_FLOOR = "stockTransferFloor";
    public static final String STOCK_TRFR_PRODUCT_SECTION = "stockTransferSection";
    public static final String SALE_ITEM_PRODUCT_TYPE = "saleItemProdType";
    public static final String SALE_ITEM_PRODUCT_CATE = "saleItemProdCate";
    public static final String SALE_ITEM_PRODUCT_SUBCATE = "saleItemProdSubcate";
    public static final String VNDR_TEMPLATE_PRODUCT_TYPE = "vendorTemplateProdType";
    public static final String PROD_REORDER_TEMPLATE_PRODUCT_TYPE = "prodReorderTemplateProdType";
    public static final String CHIT_PAYMENT_STR = "Chit_Payment";
    public static final String RANGE_NAME = "rangeName";
    public static final String PDT_ADV_SEQ_NO = "prodAdvSeqNo";
    public static final String PRODUCT_TYPE_ID = "productTypeId";
    public static final String PROD_TYPE = "productType";
    public static final String PURCHASE_TYPE = "purchaseType";
    public static final String EXCH_TO_MELTING = "ExchangeToMelting";
    public static final String EXCH_TO_RETAG = "ExchangeToRetag";
    public static final String PROD_TO_MELTING = "ProductToMelting";
    public static final String PROD_TO_RETAG = "ProductToRetag";
    public static final String SALEITEM_TO_MELTING = "SaleItemToMelting";
    public static final String SALEITEM_TO_RETAG = "SaleItemToRetag";
    public static final String GIFT_VALUE_RANGE = "giftValueRange";
    public static final String CASH_GIFT_RANGE = "cashGiftRange";
    public static final String MTL_RATE_RANGE = "mtlRateRange";
    public static final String PROD_DEMO_STATUS = "productDemoStatus";
    public static final String REMOVE_INV_ORDER = "removeInventoryOrder";
    public static final String CHIT_ENROLL_CUST_ZONE = "chitEnrollCustZone";
//  App Configuration_based

    public static final String EST_CONFIG_MODULE_NAME = "estimation_config";
    public static final String DFLT_EST_TYPE_KEY = "DEFAULT_ESTIMATION_TYPE";
    public static final String DFLT_EST_TYPE_VALUE = "ROUGH_ESTIMATION";
    public static final String PROD_CONFIG = "product_config";
    public static final String PROD_WT_TOLERANCE = "PROD_WEIGHT_TOLERANCE";

//    Json Name

    public static final String PURITY_DETAIL = "purityDetail";
    public static final String PYMNT_ISS_TYPE = "paymentIssueType";

    // Payment Mode

    public static final String ADV_ADJUST = "Advance Adjust";
    public static final String ADVANCE_COL = "Advance";
    public static final String ADVANCE_CASH_REFUND = "Advance_cash_refund";
    public static final String ADVANCE_CHEQUE_REFUND = "Advance_cheque_refund";
    public static final String ADVANCE_NON_CASH_REFUND = "Advance_non_cash_refund";
    public static final String CASH = "Cash";
    public static final String BANK = "Bank";
    public static final String CHEQUE = "Cheque";
    public static final String CHIT_PAY = "Chit";
    public static final String CR_CARD = "Credit Card";
    public static final String DR_CARD = "Debit Card";
    public static final String ONLINE = "NEFT/RTGS";

    public static final String ACH = "Ach";
    public static final String CR_VAL = "Credit Value";
    public static final String EBT = "Ebt";
    public static final String NETBANKING = "NetBanking";
    public static final String PREPAIDCARD = "PrepaidCard";
    public static final String WALLET = "Wallet";
    public static final String UPI = "Upi";
    public static final String PAYTM = "PAYTM";
    public static final String GPAY = "G-PAY";
    public static final String PHONE_PE = "PhonePe";

    public static final String SEC_PROD_ID = "secProductType";
    public static final String SEC_PROD_NAME = "secProductTypeName";
    public static final String SEC_TAX = "secTax";
    public static final String SEC_TOTAL = "secTotal";
    public static final String SEC_NAME = "secName";
    public static final String SEC_RATE = "secRate";
    public static final String SEC_PIECE = "secPiece";
    public static final String SEC_BASE_PRICE = "secBasePrice";
    public static final String CITIZEN = "Citizen";
    public static final String TSC = "Tsc";
    public static final String GODEX = "Godex";

    public static final String NO_OF_MONTHS = "noOfMonths";
    public static final String COLLECTION_TYPE = "collectionType";
    public static final String COLLECTION_AGENT = "collectionAgent";
    public static final String LAST_PAID_DATE = "lastPaidDate";

    public static final String PAID_DUE_NUMBER = "paidDueNumber";
    public static final String PENDING_DUE_NUMBER = "pendingDueNumber";
    public static final String DUE_COMPLETED = "Due_Completed";
    public static final String PENDING = "Pending";
    public static final String PAYMENT_ISSUE_TYPE = "paymentIssueType";
    public static final String MULTIPLE = "MULTIPLE";

    // Payment Credibility

    public static final String POSITIVE_UC = "POSITIVE";
    public static final String NEUTRAL_UC = "NEUTRAL";
    public static final String NEGATIVE_UC = "NEGATIVE";

//    DEMO
    public static final String AVAIL_FOR_DEMO = "Available_For_Demo";
    public static final String BOOKED = "Booked";
    public static final String DEMO_STATUS = "demoStatus";
    // Entity Based

    public static final String SUB_CATEGORY = "productSubcategory";
    public static final String LOT_SUMM_DTLS_ENTY = "lotSummaryDetailsEntity";
    public static final String INV_LOT_SUMM_ITEM_ENTY = "inventoryLotSummaryItemEntity";
    public static final String META_WEIGHT_RANGE = "metaWeightRangeEntity";
    public static final String COUNTRY = "countryEntity";
    public static final String AUDIT_TYPE = "metaAuditTypeEntity";
    public static final String AUDIT_STATUS = "metaAuditStatusEntity";
    public static final String AUDIT_DTLS_ENTY = "auditDetailsEntity";
    public static final String BANK_ACC_DTLS_ENTY = "bankAccountDtlsEnty";
    public static final String EMPLOYEE = "employeeEntity";
    public static final String EMPLOYEE_ADDRESS = "employeeAddressEntity";
    public static final String CHIT_ENROLLMENTDETAIL = "chitEnrollmentDetailsEntity";
    public static final String BRANCH = "branchDetailsEntity";
    public static final String PINCODE_ENTY = "pincodeEntity";
    public static final String ZONE_ENTY = "zoneEntity";
    public static final String CUSTOMERER = "customerEntity";
    public static final String CUSTOMERERADDRESS = "customerAddressEntity";
    public static final String CORPORATE = "corporateDetailsEntity";
    public static final String DEPARTMENT = "departmentEntity";
    public static final String STATE = "stateEntity";
    public static final String ESTIMATION_EXCHANGE_ITEM = "estimationExchangeItemsEntity";
    public static final String ESTIMATION = "estimationEntity";
    public static final String ESTIMATION_EXCHANGE = "estimationExchangeEntity";
    public static final String SALE = "salesEntity";
    public static final String EXCHANGE_ITEM = "exchangeItemsEntityList";
    public static final String EXCHANGE = "exchangeEntity";
    public static final String GIFT_ARTICLE_SALE = "giftArticleSalesEntity";
    public static final String DESIGNATION = "designationEntity";
    public static final String ROLE = "rolesEntity";
    public static final String TALUK = "talukEntity";
    public static final String TRAY = "trayDetailsEntity";
    public static final String PRODUCT = "productEntity";
    public static final String PRODUCT_ENTY_LIST = "productEntityList";
    public static final String PAYMENT_STATUS = "paymentStatusEntity";
    public static final String VENDOR_TEMPLATE = "vendorTemplateEntity";
    public static final String STOCK_TRFR_ENTY_LIST = "stockTransferProductEntityList";
    public static final String DISTRICT = "districtEntity";
    public static final String RFID = "rfidDetailsEntity";
    public static final String VENDOR = "vendorEntity";
    public static final String MELTING_LEDGER_ENTITY = "meltingLedgerEntity";
    public static final String EXPENSES_ENTITY = "expensesEntity";
    public static final String GIFT_ARTICLES_ENTITY = "giftArticlesEntity";
    public static final String VENDOR_ADDRESS = "vendorAddressEntity";
    public static final String LOT_ENTRY_ENTITY = "lotEntryEntity";
    public static final String INV_LOT_ITEM_ENTITY = "inventoryLotItemEntity";
    public static final String PRODUCT_TYPE = "metaProdTypeEnty";
    public static final String PRODUCT_CATEGORY = "metaProdCateEnty";
    public static final String PURITY = "metaPurityEntity";
    public static final String SALEITEM = "saleItemsEntityList";
    public static final String CHIT = "metaChitEntity";
    public static final String SCHEME_METADATA = "schemeMetaData";
    public static final String REPAIR_RECEIPT = "repairReceiptEntityList";
    public static final String RECV_MTM_ENTY = "receivedMetalToMetalEntity";
    public static final String RECV_MTO_ENTY = "receivedMetalOrnamentEntity";
    public static final String CHIT_PAYMENT = "chitCustPaymntDtlsEntyList";
    public static final String PROD_PURCHACE_INVOICE = "productPurchaseInvoiceEntity";
    public static final String PRODUCT_ADV_RCPT = "prodAdvRcptEntyList";
    public static final String VENDOR_MTL_MTL = "vendorMetalToMetalEntity";
    public static final String RCVD_MTL_TO_MTL = "receivedMetalToMetalEntyList";
    public static final String RCVD_MTL_TO_ORNAMENET = "receivedMetalOrnamentEntyList";
    public static final String CHIT_DISB = "chitDisbursementEntyList";
    public static final String CHIT_DISBLIST = "chitDisbursementEnty";
    public static final String RFID_STATUS = "metaRfidStatusEntity";
    public static final String RFID_TYPE = "metaRfidTypeEntity";
    public static final String EMPLOYEE_BRANCH = "employeeBranchMappingEntityList";
    public static final String STOCKTRANSFER_LOT = "stockTransferLotEntity";
    public static final String PROD_SPEC_MAP_ENTY_LIST = "prodSpecMappingEntyList";
    public static final String REORDER_SPEC_MAP_ENTY_LIST = "reorderSpecMappingEntyList";
    public static final String META_SPEC_ENTY = "metaSpecificationEntity";
    public static final String CUST_VISIT_ASSGN_ENTY = "customerVisitAssignmentEntity";
    public static final String ENQ_DTLS_ENTY = "enquiryDetailsEntity";

    public static final String AUDIT_REPORT_CLASSPATH = "jasperreport/audit-report/AuditReport.jrxml";
    public static final String CUSTOMER_REPORT_CLASSPATH = "jasperreport/customer/Customer.jrxml";
    public static final String DEALER_REPORT_CLASSPATH = "jasperreport/dealer/DealerDetail.jrxml";
    public static final String DEALER_CREDIT_REPORT_CLASSPATH = "jasperreport/dealer/DealerCreditReport.jrxml";

    public static final String SECTION_REPORT_CLASSPATH = "jasperreport/section/section-report/SectionReport.jrxml";
    public static final String COMBINE_SECTION_REPORT_CLASSPATH = "jasperreport/section/section-report/CombineSectionReport.jrxml";
    public static final String CATEGORY_REPORT_CLASSPATH = "jasperreport/section/category-report/CategoryReport.jrxml";
    public static final String SUBCATEGORY_REPORT_CLASSPATH = "jasperreport/section/sub-category-report/SubCategoryReport.jrxml";
    public static final String HOMESALES_REPORT_CLASSPATH = "jasperreport/sales/HomeSales.jrxml";
    public static final String EMPLOYEE_REPORT_CLASSPATH = "jasperreport/employee/Employee.jrxml";
    public static final String SALES_REPORT_CLASSPATH = "jasperreport/sales/SalesDelivery.jrxml";
    public static final String VIEW_SALES_REPORT_CLASSPATH = "jasperreport/sales/SalesReport.jrxml";
    public static final String SALES_WITHOUT_DELIVERY_REPORT_CLASSPATH = "jasperreport/sales/SalesWithOutDelivery.jrxml";
    public static final String SAVINGSCHEME_REPORT_CLASSPATH = "jasperreport/savingscheme/SavingScheme.jrxml";
    public static final String SAVINGSCHEME_GRM_REPORT_CLASSPATH = "jasperreport/savingscheme/SavingSchemeGrm.jrxml";
    public static final String SAVINGSCHEME_CLOSED_REPORT_CLASSPATH = "jasperreport/savingscheme/SchemeClosed.jrxml";
    public static final String SAVINGSCHEME_COLLECTION_REPORT_CLASSPATH = "jasperreport/savingscheme/SchemeCollection.jrxml";
    public static final String PURCHASE_INOVICE_CLASSPATH = "jasperreport/purchase-invoice/PurchaseInvoice.jrxml";
    public static final String EXCHANGE_REPORT_CLASSPATH = "jasperreport/product/ExchangeReport.jrxml";
    public static final String EXCHANGE_CLASSPATH = "jasperreport/product/ExchangeReport.jrxml";

    public static final String CUSTOMER_CREDIT_REPORT_CLASSPATH = "jasperreport/customer/CreditReport.jrxml";
    public static final String CUSTOMER_CREDIT_USAGE_REPORT_CLASSPATH = "jasperreport/customer/CreditUsageReport.jrxml";
    public static final String CUSTOMER_ADVANCE_REPORT_CLASSPATH = "jasperreport/customer/AdvanceReport.jrxml";
    public static final String CUSTOMER_ADVANCE_USAGE_REPORT_CLASSPATH = "jasperreport/customer/AdvanceUsageReport.jrxml";
    public static final String PRODUCT_INVENTORY_CLASSPATH = "jasperreport/product/InventoryReport.jrxml";
    public static final String SAVINGSCHEME_OUTSTANDING_REPORT_CLASSPATH = "jasperreport/savingscheme/SchemeOutstanding.jrxml";
    public static final String CHIT_ENROLLMENT_REPORT_CLASSPATH = "jasperreport/savingscheme/chit-enrollment-details/ChitEnrollmentDetail.jrxml";
    public static final String SALES_ESTIMATION_REPORT_CLASSPATH = "jasperreport/estimation/SalesEstimation.jrxml";
    public static final String SALES_ESTIMATION_ADD_SALES_REPORT_CLASSPATH = "jasperreport/estimation/AddSales.jrxml";
    public static final String PURCHASE_QUOTATION_REPORT_CLASSPATH = "jasperreport/estimation/PurchaseQuotation.jrxml";
    public static final String ESTIMATION_EXCHANGE_REPORT_CLASSPATH = "jasperreport/estimation/EstimationExchange.jrxml";
    public static final String CREDIT_DEBIT_REPORT_CLASSPATH = "jasperreport/customer/CreditDebitReport.jrxml";
    public static final String QR_CLASSPATH = "jasperreport/barcode/Blank_A4.jrxml";
    public static final String GIFT_ARTICLE_SALES_REPORT_CLASSPATH = "jasperreport/estimation/GiftArticles.jrxml";
    public static final String EXPENSES_REPORT_CLASSPATH = "jasperreport/accounts/ExpensesReport.jrxml";
    public static final String GIFT_ARTICLE_QUOTATION_REPORT_CLASSPATH = "jasperreport/product/GiftArticlesQuotation.jrxml";
    public static final String SECONDARY_METAL_REPORT_CLASSPATH = "jasperreport/product/SecondaryMetalReport.jrxml";
    public static final String PRODUCT_ORDER_REPORT_CLASSPATH = "jasperreport/product/ProductOrderReport.jrxml";
    public static final String SAVINGSCHEME_COLLECTIONMODE_REPORT_CLASSPATH = "jasperreport/savingscheme/SchemeCollectionMode.jrxml";
    public static final String GIFTARTCLS_INVENTORY_CLASSPATH = "jasperreport/product/GiftArticlesInventory.jrxml";
    public static final String SAVINGSCHEME_TRANSACTION_REPORT_CLASSPATH = "jasperreport/savingscheme/SchemeTransectionReport.jrxml";
    public static final String ITEM_TRANSFER_REPORT_CLASSPATH = "jasperreport/product/ItemTransferReport.jrxml";
    public static final String RECIPT_REPORT_CLASSPATH = "jasperreport/accounts/ReciptReport.jrxml";
    public static final String ADVANCE_RECIPT_REPORT_CLASSPATH = "jasperreport/product/AdvanceReciptReport.jrxml";

    public static final String BANK_ACCOUNT_DETAIL_REPORT_CLASSPATH = "jasperreport/accounts/BankAccountDetail.jrxml";
    public static final String ITEM_TRANSFER_EXCHANGE_REPORT_CLASSPATH = "jasperreport/product/ItemTransferExchangeReport.jrxml";
    public static final String PRODUCT_REORDER_REPORT_CLASSPATH = "jasperreport/product/ProductReOrderReport.jrxml";
    public static final String BUYBACK_REPORT_CLASSPATH = "jasperreport/product/BuyBackReport.jrxml";
    public static final String AASARI_STOCK_CLASSPATH = "jasperreport/dealer/AasariStock.jrxml";

    public static final String BUYBACK_REPORT_NAME = "attachment;filename=BuyBackReport.pdf";
    public static final String HOMESALES_REPORT_NAME = "attachment;filename=HomeSales.pdf";
    public static final String PRODUCT_REORDER_REPORT_NAME = "attachment;filename=ProductReOrderReport.pdf";
    public static final String ITEM_TRANSFER_REPORT_NAME = "attachment;filename=ItemTransferReport.pdf";
    public static final String RECIPT_REPORT_NAME = "attachment;filename=ReciptReport.pdf";
    public static final String BANK_ACCOUNT_DETAIL_REPORT_NAME = "attachment;filename=BankAccountDetailReport.pdf";

    public static final String PARAMS_CREATEDBY_KEY = "zinger";
    public static final String PARAMS_CREATEDBY_VALUE = "zinger";
    public static final String PARAMS_REPORT_HEADER = "ReportHeader";

    public static final String CONTENT_TYPE_PDF = "application/pdf";
    public static final String CONTENT_TYPE_JSON = "application/json";
    public static final String CONTENT_DISPOSITION = "Content-disposition";
    public static final String ITEM_TRANSFER_EXCHANGE_REPORT_NAME = "attachment;filename=ItemTransferExchangeReport.pdf";
    public static final String AUDIT_REPORT_NAME = "attachment;filename=AuditReport.pdf";
    public static final String CUSTOMER_REPORT_NAME = "attachment;filename=CustomerReport.pdf";
    public static final String DEALER_REPORT_NAME = "attachment;filename=DealerReport.pdf";
    public static final String SECTION_REPORT_NAME = "attachment;filename=SectionReport.pdf";
    public static final String CATEGORY_REPORT_NAME = "attachment;filename=CategoryReport.pdf";
    public static final String SUBCATEGORY_REPORT_NAME = "attachment;filename=SubCategoryReport.pdf";
    public static final String EMPLOYEE_REPORT_NAME = "attachment;filename=EmployeeReport.pdf";
    public static final String SALES_REPORT_NAME = "attachment;filename=SalesReport.pdf";
    public static final String SCHEME_REPORT_NAME = "attachment;filename=SchemeReport.pdf";
    public static final String PURCHASE_INOVICE_NAME = "attachment;filename=PurchaseInvoice.pdf";
    public static final String EXCHANGE_REPORT_NAME = "attachment;filename=ExchangeData.pdf";
    public static final String CUSTOMER_CREDIT_DETAIL_REPORT_NAME = "attachment;filename=CreditReport.pdf";
    public static final String CUSTOMER_CREDIT_USAGE_DETAIL_REPORT_NAME = "attachment;filename=CreditUsageReport.pdf";
    public static final String PRODUCT_REPORT_NAME = "attachment;filename=ProductReport.pdf";
    public static final String CHIT_ENROLLMENT_REPORT_NAME = "attachment;filename=ChitCustomer.pdf";
    public static final String CHIT_CUSTOMER_PAYMENT_REPORT_NAME = "attachment;filename=CustomerPayment.pdf";
    public static final String PRODUCT_ORDER_REPORT_NAME = "attachment;filename=ProductOrder.pdf";
    public static final String EXPENSES_REPORT_NAME = "attachment;filename=Expences.pdf";
    public static final String SALES_ESTIMATION_REPORT_NAME = "attachment;filename=SalesEstimation.pdf";
    public static final String SALES_ESTIMATION_ADD_SALES_REPORT_NAME = "attachment;filename=SalesEstimationAddSales.pdf";
    public static final String SALES_ESTIMATION_EXCHANGE_REPORT_NAME = "attachment;filename=SalesEstimationExchange.pdf";
    public static final String ESTIMATION_EXCHANGE_REPORT_NAME = "attachment;filename=EstimationExchange.pdf";
    public static final String CREDIT_DEBIT_REPORT_NAME = "attachment;filename=creditDebitReport.pdf";
    public static final String DEALER_CREDIT_REPORT_NAME = "attachment;filename=DealerCreditReport.pdf";
    public static final String GIFT_ARTICLE_SALES_REPORT_NAME = "attachment;filename=GiftArticle.pdf";
    public static final String GIFT_ARTICLE_QUOTATION_REPORT_NAME = "attachment;filename=GiftArticle.pdf";
    public static final String SECONDARY_REPORT_NAME = "attachment;filename=SecondaryMetalReport.pdf";
    public static final String SCHEME_TRANSACTION_REPORT_NAME = "attachment;filename=SchemeTransectionReport.pdf";
    public static final String GIFTARTCLS_REPORT_NAME = "attachment;filename=GiftArtcleReport.pdf";
    public static final String AASARI_REPORT_NAME = "attachment;filename=AasariStock.pdf";

    public static final String CACHE_CONTROL_KEY = "Cache-Control";
    public static final String CACHE_CONTROL_VALUE = "no-cache,no-store,must-revalidate";
    public static final String PARAGMA_KEY = "Pragma";
    public static final String PARAGMA_VALUE = "no-cache";
    public static final String EXPIRES_KEY = "Expires";
    public static final String EXPIRES_VALUE = "0";

    public static final String PRINTER_CLIENT_FAILURE = "Printer Client Get Request Failed";
    public static final String HTTP_ERROR = "Failed : HTTP error code : ";
    public static final String PRINTER_NOT_AVAILABLE = "No Printer Available ";

    public static final String STOCK_TRANS_REPORT_NAME = "attachment;filename=StockTransReport.pdf";

    public static final String STOCK_TRANSECTION_REPORT_CLASSPATH = "jasperreport/product/StockTransferReport.jrxml";
    public static final String SMS = "SMS";
    public static final String SAVINGS_SCHEME_PAYMENT_ACK = "EN_SAVINGS_SCHEME_PAYMENT_ACK";
    public static final String COMM_CHANNEL_NOT_FOUND_FOR = "Communication Channel Not Found For ";
    public static final String COMM_CONFIG_NOT_FOUND_FOR = "Communication Config Data Not Found For ";
    public static final String COMM_TEMPLATE_NOT_FOUND_FOR = "Communication Template Data Not Found For ";
    public static final String INVALID_MOBILE_MSG = "Invalid Mobile Number. Could Not Send SMS";
    public static final String HASHED_FORMAT = "hashed_format";
    public static final String SEQUENCE_FORMAT = "sequence_format";
    public static final String SALES_THRESHOLD_AMOUNT = "sales_threshold_amount";
    public static final String PROD_CODE_FORMAT = "product_code_format";
    public static final String CHIT_CONFIG = "chit_config";
    public static final String RESTRICT_CHIT_PYMT = "restrict_chit_pymt";
    public static final String CUSTOMER_CONFIG = "customer_config";
    public static final String CUSTOMER_MOBILE_UNIQUE = "customer_mobile_unique";
    public static final String CGST = "CGST";
    public static final String SGST = "SGST";
    public static final String IGST = "IGST";
    public static final String VAT = "VAT";
    public static final String INTER_STATE = "InterState";
    public static final String INTRA_STATE = "IntraState";

    public enum SEQUENCETYPE {

	CUSTOMER_PAYMENT("CUSTOMER_PAYMENT"), ESTIMATION("ESTIMATION"), EXCHANGE("EXCHANGE"),
	ESTIMATION_EXCHANGE("ESTIMATION_EXCHANGE"), PRODUCT_ADVANCE("PRODUCT_ADVANCE"),
	PRODUCT_ADVANCE_RECEIPT("PRODUCT_ADVANCE_RECEIPT"), RECEIPT("RECEIPT"), REPAIR_RECEIPT("REPAIR_RECEIPT"),
	PRODUCT_CODE("PRODUCT_CODE"), CHIT_ID("CHIT_ID"), GIFT_ARTICLE_PRODUCT_CODE("GIFT_ARTICLE_PRODUCT_CODE"),
	SALE_ID("SALE_ID"), HOME_PRODUCT("HOME_PRODUCT"), NON_TAG_PRODUCT("NON_TAG_PRODUCT"), ISSUE("ISSUE"),
	CHIT_DISBURSEMENT_ID("CHIT_DISBURSEMENT_ID"), CUSTOMER_CREDIT_ID("CUSTOMER_CREDIT_ID"),
	GIFT_ARTICLE_SALE_ID("GIFT_ARTICLE_SALE_ID"), VNDR_MTL_MTL_BILLNO("VNDR_MTL_MTL_BILLNO"),
	RCVD_MTL_MTL_BILLNO("RCVD_MTL_MTL_BILLNO"), RCVD_MTL_ORNAMENT_BILLNO("RCVD_MTL_ORNAMENT_BILLNO"),
	REFINING_MI_BILLNO("REFINING_MI_BILLNO"), REFINING_MR_BILLNO("REFINING_MR_BILLNO"),
	REFINING_PI_BILLNO("REFINING_PI_BILLNO"), REFINING_PR_BILLNO("REFINING_PR_BILLNO"),
	GIFT_ARTICLE_QUOTATION("GIFT_ARTICLE_QUOTATION"), EMPLOYEE("EMPLOYEE"), EXPENSES("EXPENSES"),
	LOT_ENTRY("LOT_ENTRY"), PRODUCT_PURCHASE_INVOICE("PRODUCT_PURCHASE_INVOICE"), MELTING_LEDGER("MELTING_LEDGER"),
	STOCK_TRANSFER_LOT("STOCK_TRANSFER_LOT"), CUSTOMER_CREDIT_USAGE("CUSTOMER_CREDIT_USAGE"),
	BANK_TRANSACTION("BANK_TRANSACTION"), INVENTORY_PURCHASE_ITEM("INVENTORY_PURCHASE_ITEM"),
	INVENTORY_LOT_ITEM("INVENTORY_LOT_ITEM"), INVENTORY_ITEM("INVENTORY_ITEM"),
	ADVANCE_WITH_DELIVERY("ADVANCE_WITH_DELIVERY"), ADVANCE_WITHOUT_DELIVERY("ADVANCE_WITHOUT_DELIVERY"),
	SOLD("SOLD"), CUSTOMER_DEMO("CUSTOMER_DEMO"), EMP_SALARY_ADV("EMP_SALARY_ADV");

	private final String text;

	SEQUENCETYPE(final String text) {
	    this.text = text;
	}

	@Override
	public String toString() {
	    return text;
	}

    }

    public enum PREDEFINEDTYPE {
	SALES("SALES"), PRODUCT_MISC("PRODUCT_MISC"), IMAGE_PATH("IMAGE_PATH"), ESTIMATION("ESTIMATION"),
	INVENTORY("INVENTORY");

	private final String text;

	PREDEFINEDTYPE(final String text) {
	    this.text = text;
	}

	@Override
	public String toString() {
	    return text;
	}
    }

    public enum STATUSTYPE {
	ESTIMATION("ESTIMATION"), SOLD("Sold"), HOME_PRODUCT("Home_Product"), SALE("Sale"),
	ADVANCE_WITH_DELIVERY("Advance_With_Delivery"), ADVANCE_WITHOUT_DELIVERY("Advance_Without_Delivery"),
	ISSUE("Issue"), RETURN("Return"), TRANSFERRED("Transferred"), NOT_A_SALE("Not a sale"), PENDING("PENDING");

	private final String text;

	STATUSTYPE(final String text) {
	    this.text = text;
	}

	@Override
	public String toString() {
	    return text;
	}
    }

    public enum PROCESSSTATUS {
	PENDING, FOR_RETAGGING_FROM_ASSEMBLY, FOR_MELTING, RIGHT_OFF, TAGGED
    }

    public enum PAYMENTTYPE {
	CASH("CASH");

	private final String text;

	PAYMENTTYPE(final String text) {
	    this.text = text;
	}

	@Override
	public String toString() {
	    return text;
	}
    }

    public enum EXPORTTYPE {
	XLS("XLS"), PDF("PDF"), HTML("HTML"), CSV("CSV");

	private final String text;

	EXPORTTYPE(final String text) {
	    this.text = text;
	}

	@Override
	public String toString() {
	    return text;
	}

    }

    public enum SECTIONREPORTTYPE {
	SECTION("SECTION"), CATEGORY("CATEGORY");

	private final String text;

	SECTIONREPORTTYPE(final String text) {
	    this.text = text;
	}

	@Override
	public String toString() {
	    return text;
	}

    }

    public enum REPORTTYPE {

	AMOUNT("AMOUNT"), GRAM("GRAM");

	private final String text;

	REPORTTYPE(final String text) {
	    this.text = text;
	}

	@Override
	public String toString() {
	    return text;
	}

    }

}
