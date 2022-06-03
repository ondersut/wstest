package GetSalesByDateRange;

public class GetSalesByDateRangeRequest {
	private String apiKey;
	private String sign;
	private String time;
	private String withData;
	private String byStatus;
	private String byUser;
	private String orderBy;
	private String orderType;
	private String startDate;
	private String endDate;
	private String pageNumber;
	private String pageSize;
	private String lang;
	
	
	
	
	@Override
	public String toString() {
		return "GetSalesByDateRangeRequest [apiKey=" + apiKey + ", sign=" + sign + ", time=" + time + ", withData="
				+ withData + ", byStatus=" + byStatus + ", byUser=" + byUser + ", orderBy=" + orderBy + ", orderType="
				+ orderType + ", startDate=" + startDate + ", endDate=" + endDate + ", pageNumber=" + pageNumber
				+ ", pageSize=" + pageSize + ", lang=" + lang + "]";
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getWithData() {
		return withData;
	}
	public void setWithData(String withData) {
		this.withData = withData;
	}
	public String getByStatus() {
		return byStatus;
	}
	public void setByStatus(String byStatus) {
		this.byStatus = byStatus;
	}
	public String getByUser() {
		return byUser;
	}
	public void setByUser(String byUser) {
		this.byUser = byUser;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	
}
