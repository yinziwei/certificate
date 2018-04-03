package com.cnk.qiye.service.certificate.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.constant.StatusConstant;
import com.cnk.qiye.mapper.CHotMapper;
import com.cnk.qiye.pojo.CHot;
import com.cnk.qiye.service.certificate.CertificateService;

@Service
public class CertificateServiceImpl implements CertificateService{
	
	private Logger log = LogManager.getLogger(getClass());
	
	@Autowired
	private CHotMapper cHotMapper;
	
	/**
	 * 根据id查询证书热度
	 */
	@Override
	public CommonResult selectByPrimaryKey(Long id) {
		
		CHot cHot;
		try {
			cHot = cHotMapper.selectByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id查询证书热度成功",cHot);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id查询证书热度失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id查询证书热度失败",null);
	}

}
