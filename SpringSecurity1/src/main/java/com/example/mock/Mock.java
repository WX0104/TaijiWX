package com.example.mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mock {

	public static final String User_Key = "user";
	
	//相当于实例化两个map集合 然后添加到list集合
	public static List<Map> userList = new ArrayList() {
	       {
				add(new HashMap() {
					{
						put("user", "user");
					}
				});
				add(new HashMap() {
					{
						put("admin", "admin");
					}
				});
			}
		};
		
		
}
