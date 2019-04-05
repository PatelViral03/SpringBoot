package com.virus.shopingcart.utils;

public interface RegexConstant {

	String ALPHABAT_ONLY="^[a-zA-Z\\s]+$";
	String IS_VALID_EMAIL= "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
	String IS_VALID_PASSORD="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@\\$_-])(?=.{8,})(?=.{8})";
	String IS_VALID_MOBILE_NO="^[6-9][0-9]{1,9}$";
	
}
