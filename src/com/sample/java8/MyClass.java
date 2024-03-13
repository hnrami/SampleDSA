package com.sample.java8;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MyClass {


	
	    private String field1;
	    private Integer field2;
	    private Double field3;
	    
	    

	    // Constructors, getters, setters, and other methods...

	    @Override
		public String toString() {
			return "MyClass [field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + "]";
		}

		public String getField1() {
			return field1;
		}

		public void setField1(String field1) {
			this.field1 = field1;
		}

		public Integer getField2() {
			return field2;
		}

		public void setField2(Integer field2) {
			this.field2 = field2;
		}

		public Double getField3() {
			return field3;
		}

		public void setField3(Double field3) {
			this.field3 = field3;
		}

				    // Constructors, getters, setters, and other methods...

		    // Method to remove fields with null values
		    public void removeNullValues() {
		        Class<?> clazz = this.getClass();
		        Field[] fields = clazz.getDeclaredFields();

		        List<Field> fieldsToRemove = new ArrayList<>();

		        for (Field field : fields) {
		            try {
		                field.setAccessible(true);
		                Object value = field.get(this);

		                if (value == null) {
		                    fieldsToRemove.add(field);
		                }
		            } catch (IllegalAccessException e) {
		                e.printStackTrace(); // Handle exception as needed
		            }
		        }

		        for (Field fieldToRemove : fieldsToRemove) {
		            try {
		                fieldToRemove.setAccessible(true);
		                fieldToRemove.set(this, null);
		            } catch (IllegalAccessException e) {
		                e.printStackTrace(); // Handle exception as needed
		            }
		        }
		    }

		    public static void main(String[] args) {
		        MyClass myObject = new MyClass();
		        myObject.setField1("Value1");
		        myObject.setField2(null);
		        myObject.setField3(3.14);

		        System.out.println("Before removing null values: " + myObject);

		        myObject.removeNullValues();

		        System.out.println("After removing null values: " + myObject);
		    }
		}
