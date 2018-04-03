package com.cnk.qiye.util;

import java.util.Random;

/**
 * 字符串生成 工具类
 * @author 黄山
 *
 */
public class StringUtil {
	
	//随机生成的字符
	private static final char[] code = { 'A','B', 'C','D', 'E', 'F', 'G', 'H', 'I','J',  
            'K', 'L', 'M', 'N', 'O', 'P',  'Q',  'R', 'S', 'T', 'U', 'V', 'W',  
            'X', 'Y', 'Z'};  

	/**
	 * 随机生成6位数的盐
	 * @return
	 */
	public static synchronized String getRandomSalt(){
    	int Num;
    	StringBuffer buffer = new StringBuffer();
    	for(int i=0;i<6;i++){
    		Num = new Random().nextInt(26);
    		buffer.append(code[Num]);
    	}
    	return buffer.toString();
	}
	
	/**
	 * 随机生成用户名
	 * @return
	 */
	public static synchronized String getRandomNike(){
		StringBuffer buffer = new StringBuffer("用户");
		//生成一个8位的随机数字
		for(int i=0;i<8;i++){
			int num = new Random().nextInt(10);
			buffer.append(num);
		}
		
		return buffer.toString();
	}
	
	/**
	 * 将密码和盐混合到一起并用md5加密
	 * @param password
	 * @param salt
	 * @return
	 */
	public static String mixPasswordAndSaltToMd5(String password,String salt){
		StringBuffer buffer = new StringBuffer();
		buffer.append(password);
		buffer.append(salt);
		return PasswordUtil.encode(buffer.toString());
	}
	
	/**
	 * 验证密码是否正确
	 * @param 自己输入的密码
	 * @param 数据库中查到的密码
	 * @param 盐
	 * @return
	 */
	public static boolean testifyPassword(String password_u,String password_m,String salt){
		return PasswordUtil.encode(StringUtil.mixPasswordAndSaltToMd5(password_u, salt)).equals(password_m);
	}
}
