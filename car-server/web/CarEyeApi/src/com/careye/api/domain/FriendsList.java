package com.careye.api.domain;
/**
 * 
 * @项目名称：car-eye
 * @类名称：
 * @类描述：
 * @创建人：ll
 * @创建时间：2016-1-12 下午02:38:18
 * @修改人：ll
 * @修改时间：2016-1-12 下午02:38:18
 * @修改备注：
 * @version 1.0
 */
public class FriendsList {
	
	private Integer userid;
	private Integer vid;
	/**车牌号*/
	private String carnumber;
	/**设备号**/
	private String terminal;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public String getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	
}
