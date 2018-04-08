package com.cnk.qiye.service.colloge.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.constant.StatusConstant;
import com.cnk.qiye.mapper.CMajorMapper;
import com.cnk.qiye.pojo.CMajor;
import com.cnk.qiye.service.colloge.MajorService;


/**
 * 专业service实现
 * @author 黄山
 *
 */
@Service
public class MajorServiceImpl implements MajorService {

	private Logger log = LogManager.getLogger(getClass());
	
	@Autowired
	private CMajorMapper cMajorMapper;
	
	
	/**
	 * 查询专业列表
	 */
	@Override
	public CommonResult findMajorList() {
		try {
			List<CMajor> list = cMajorMapper.selectList();
			return new CommonResult(StatusConstant.SUCCESS.getCode(),StatusConstant.SUCCESS.getMsg() , list);
		} catch (Exception e) {
			e.printStackTrace();
			return new CommonResult(StatusConstant.FAILD.getCode(),"MajorServiceImpl:查询专业列表失败", null);
		}
		
	}

}
