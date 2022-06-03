package GetSalesByDateRange;

public class GetSalesByDateRangeResponse
{
    private String timeElapsed;

    private String nextPageAvailable;

    private String ackCode;

    private String responseTime;

    private String saleCount;

    private String sellerPromotionInfos;

    private Sales sales;
    
    private Error error;

    public String getTimeElapsed ()
    {
        return timeElapsed;
    }

    public void setTimeElapsed (String timeElapsed)
    {
        this.timeElapsed = timeElapsed;
    }

    public String getNextPageAvailable ()
    {
        return nextPageAvailable;
    }

    public void setNextPageAvailable (String nextPageAvailable)
    {
        this.nextPageAvailable = nextPageAvailable;
    }

    public String getAckCode ()
    {
        return ackCode;
    }

    public void setAckCode (String ackCode)
    {
        this.ackCode = ackCode;
    }

    public String getResponseTime ()
    {
        return responseTime;
    }

    public void setResponseTime (String responseTime)
    {
        this.responseTime = responseTime;
    }

    public String getSaleCount ()
    {
        return saleCount;
    }

    public void setSaleCount (String saleCount)
    {
        this.saleCount = saleCount;
    }

    public String getSellerPromotionInfos ()
    {
        return sellerPromotionInfos;
    }

    public void setSellerPromotionInfos (String sellerPromotionInfos)
    {
        this.sellerPromotionInfos = sellerPromotionInfos;
    }

    public Sales getSales ()
    {
        return sales;
    }

    public void setSales (Sales sales)
    {
        this.sales = sales;
    }

    public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	@Override
    public String toString()
    {
        return "ClassPojo [timeElapsed = "+timeElapsed+", nextPageAvailable = "+nextPageAvailable+", ackCode = "+ackCode+", responseTime = "+responseTime+", saleCount = "+saleCount+", sellerPromotionInfos = "+sellerPromotionInfos+", sales = "+sales+"]";
    }
}
			
