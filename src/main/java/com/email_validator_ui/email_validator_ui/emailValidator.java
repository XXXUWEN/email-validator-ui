package com.email_validator_ui.email_validator_ui;

public class emailValidator {
	public static void main(){
	}
	public int checkInpt(String emailAddress){
		int j=0,k=0;
		//for indicate space
		int l = 0;
		int result = 0;
		for(int i = 0;i < emailAddress.length();i++){
			if(emailAddress.charAt(i)=='@'){
				j++;
			}
			if(emailAddress.charAt(i)=='.'){
				k++;
			}
			//calculate number of space 
			if(emailAddress.charAt(i)==' '){
				l++;
			}
		}
		if(j>1&&k==0){
			return 0;
		}
		if(k==0&&j==1){
			return 1;
		}
		if(j>1&&k>0){
			return 1;
		} 
		if(j==0&&k==0){
			return 0;
		}
		if(j==1&&k>0){
			return 2;
		}
		if(j==0&&k>0){
			return 1;
		}
		//check if there exist space in emailAddress
		if(l>0){
			return 0;
		}
		return result;
	}
	
	//check domain name
	public int testDomain(String emailAddress){
		int domainResult = 0;
		if(emailAddress.matches("^.*[.][c][o][m]*$")){
			domainResult = 1;
		}
		return domainResult;
	}
	
}
