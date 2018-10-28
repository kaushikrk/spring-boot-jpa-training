package com.ikshavaku.actorsdirectory.model.User;

public enum ProfileType {
	Myself,
    Son,
    Daughter,
    Brother,
    Sister,
    Friend,
    Relative;
    
    public static boolean isValidType(String type) {
    	boolean isType=false;
    	for(ProfileType profileType:ProfileType.values()) {
    		if(type.equals(profileType.toString())) {
    			isType=true;
    		}
    	}
    	return isType;
    }
}
