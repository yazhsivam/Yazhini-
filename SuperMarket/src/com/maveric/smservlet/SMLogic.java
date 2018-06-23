package com.maveric.smservlet;

import java.sql.SQLException;

import com.maveric.SMDB.SmDB;

public class SMLogic {
	
	public boolean userActive(SMModel modelvalues) throws SQLException

	{	
		boolean adminRegister=false;
		
		if(modelvalues.getDeptCode().equals("Administrator"))
						
			{					
				SmDB dao = new SmDB();
				int update = dao.AdminToDB(modelvalues);
								
				if(update==1)
				{
					
					adminRegister =true;
				}
							
			}
		return adminRegister;
	}
	
	public boolean validUser(SMModel modelvalues1) throws SQLException
	{
		SmDB dao1 = new SmDB();
		boolean userflag = dao1.CheckLogin(modelvalues1.getEmpId());
		
		if (userflag){
			
			System.out.println("User Validated");
    	
		}
		return userflag;
		
	}
	
	
		
		
		
	

	}
	
		
	
		
	


