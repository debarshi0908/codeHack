package hdp.parser;

public class MRKeyValueDetails{
	
	public MRKeyValueDetails() {
	  
	}
	public MRKeyValueDetails(String in_keytype, String in_valuetype, String out_keytype, String out_valuetype) {
		  setIn_keytype(TEXT);
		  setIn_valuetype(INT_WRITABLE);
		  setOut_keytype(TEXT);
		  setOut_valuetype(INT_WRITABLE);
	}
	public static final String INT_WRITABLE="IntWritable";
	public static final String LONG_WRITABLE="LongWritable";
	public static final String FLOAT_WRITABLE="FloatWritable";
	public static final String DOUBLE_WRITABLE="DoubleWritable";
	public static final String TEXT="Text";
	
	public static final  int _INT_WRITABLE=1;
	public static final int _LONG_WRITABLE=2;
	public static final int _FLOAT_WRITABLE=3;
	public static final int _DOUBLE_WRITABLE=4;
	public static final int _TEXT=5;
	
	
	protected String getType(int type) {
	 switch (type) {
	case _INT_WRITABLE:
		return INT_WRITABLE;
	case _LONG_WRITABLE:
		return LONG_WRITABLE;
	case _FLOAT_WRITABLE:
		return FLOAT_WRITABLE;
	case _DOUBLE_WRITABLE:
		return DOUBLE_WRITABLE;
	case _TEXT:
		return TEXT;
	default:
		throw new RuntimeException("Unexpected type:"+type);
	}	
	}

	private String in_keytype = LONG_WRITABLE;
	private String out_keytype =TEXT;
	private String in_valuetype =TEXT;
	private String out_valuetype=INT_WRITABLE;
	public String getIn_keytype() {
		return in_keytype;
	}
	public void setIn_keytype(String inKeytype) {
		in_keytype = inKeytype;
	}
	public String getOut_keytype() {
		return out_keytype;
	}
	public void setOut_keytype(String outKeytype) {
		out_keytype = outKeytype;
	}
	public String getIn_valuetype() {
		return in_valuetype;
	}
	public void setIn_valuetype(String inValuetype) {
		in_valuetype = inValuetype;
	}
	public String getOut_valuetype() {
		return out_valuetype;
	}
	public void setOut_valuetype(String outValuetype) {
		out_valuetype = outValuetype;
	}

}
