package com.sample.java8;

import java.util.HashMap;
import java.util.Map;

public class FieldConfig implements Cloneable{

	private Map<String, String> dependentFields;
    private Integer minLength;
    
    
    

    public Map<String, String> getDependentFields() {
		return dependentFields;
	}

	public void setDependentFields(Map<String, String> dependentFields) {
		this.dependentFields = dependentFields;
	}

	public Integer getMinLength() {
		return minLength;
	}

	public void setMinLength(Integer minLength) {
		this.minLength = minLength;
	}

	// Copy constructor
    public FieldConfig(FieldConfig original) {
        if (original.dependentFields != null) {
            this.dependentFields = new HashMap<>(original.dependentFields);
        }
        this.minLength = (original.minLength != null) ? new Integer(original.minLength) : null;
    }

    // Static factory method for creating a copy
    public static FieldConfig copyOf(FieldConfig original) {
        return new FieldConfig(original);
    }

    public static void main(String[] args) {
        FieldConfig original = null ;
        original.setDependentFields(Map.of("key", "value"));
        original.setMinLength(10);

        // Using the copy constructor to create a copy
        FieldConfig copyUsingConstructor = new FieldConfig(original);

        // Using the static factory method to create a copy
        FieldConfig copyUsingFactoryMethod = FieldConfig.copyOf(original);

        // Use 'copyUsingConstructor' and 'copyUsingFactoryMethod' as needed...
    }

}
