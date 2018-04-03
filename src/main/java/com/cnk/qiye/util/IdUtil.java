package com.cnk.qiye.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 生成id工具类
 * @author 黄山
 *
 */
public class IdUtil {

	/**
	 * 生成证书id 当前时间长整型+2位随机数
	 * @return
	 */
	public static synchronized Long generateItemId(){
		//取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		//加上两位随机数
		Random random = new Random();
		int end2 = random.nextInt(99);
		//如果不足两位前面补0
		String str = millis + String.format("%02d", end2);
		long id = new Long(str);
		return id;
	}
	
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			System.out.println(IdUtil.generateItemId());
		}
	}
}
