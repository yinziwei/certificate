package com.cnk.qiye.service.certificate;

import com.cnk.qiye.common.CommonResult;

public interface CertificateService {

	/**
	 * 根据id查询证书热度
	 */
	public CommonResult selectByPrimaryKey(Long id);
}
