/* car-eye车辆管理平台 
 * car-eye车辆管理公共平台   www.car-eye.cn
 * car-eye开源网址:  https://github.com/Car-eye-admin
 * Copyright car-eye 车辆管理平台  2017 
 */

package com.careye.dsbusiness.threadpool;

import java.io.Serializable;

import javax.jms.MapMessage;

import com.careye.dsbusiness.business.ReceiveBusiness;

/**
 *     
 * 项目名称：dsbusiness    
 * 类名称：ThreadPoolTask    
 * 类描述：    
 * 创建人：zr    
 * 创建时间：2015-5-12 下午04:53:48    
 * 修改人：zr    
 * 修改时间：2015-5-12 下午04:53:48    
 * 修改备注：    
 * @version 1.0  
 *
 */
public class ThreadPoolTask implements Runnable, Serializable{  
	private static final long serialVersionUID = 0;  

	private MapMessage msgData;
	
	public ThreadPoolTask(MapMessage msgData){  
		this.msgData = msgData;  
	}

	@Override
	public void run() {
		
		try {
			ReceiveBusiness.mqMessageReceived(msgData);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}  
}
