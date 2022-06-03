package GetSalesByDateRange;

public class Sale
{
    private String thumbImageLink;

    private String amount;

    private String commissionRate;

    private String productId;

    private String cargoPayment;

    private String endDate;

    private String cargoCode;

    private ShippingInfo shippingInfo;

    private String saleCode;

    private String lastActionDate;

    private String productTitle;

    private BuyerInfo buyerInfo;

    private String itemId;

    private String price;

    private String moneyDate;

    private String variantId;

    private String status;

    private String statusCode;

    public String getThumbImageLink ()
    {
        return thumbImageLink;
    }

    public void setThumbImageLink (String thumbImageLink)
    {
        this.thumbImageLink = thumbImageLink;
    }

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public String getCommissionRate ()
    {
        return commissionRate;
    }

    public void setCommissionRate (String commissionRate)
    {
        this.commissionRate = commissionRate;
    }

    public String getProductId ()
    {
        return productId;
    }

    public void setProductId (String productId)
    {
        this.productId = productId;
    }

    public String getCargoPayment ()
    {
        return cargoPayment;
    }

    public void setCargoPayment (String cargoPayment)
    {
        this.cargoPayment = cargoPayment;
    }

    public String getEndDate ()
    {
        return endDate;
    }

    public void setEndDate (String endDate)
    {
        this.endDate = endDate;
    }

    public String getCargoCode ()
    {
        return cargoCode;
    }

    public void setCargoCode (String cargoCode)
    {
        this.cargoCode = cargoCode;
    }

    public ShippingInfo getShippingInfo ()
    {
        return shippingInfo;
    }

    public void setShippingInfo (ShippingInfo shippingInfo)
    {
        this.shippingInfo = shippingInfo;
    }

    public String getSaleCode ()
    {
        return saleCode;
    }

    public void setSaleCode (String saleCode)
    {
        this.saleCode = saleCode;
    }

    public String getLastActionDate ()
    {
        return lastActionDate;
    }

    public void setLastActionDate (String lastActionDate)
    {
        this.lastActionDate = lastActionDate;
    }

    public String getProductTitle ()
    {
        return productTitle;
    }

    public void setProductTitle (String productTitle)
    {
        this.productTitle = productTitle;
    }

    public BuyerInfo getBuyerInfo ()
    {
        return buyerInfo;
    }

    public void setBuyerInfo (BuyerInfo buyerInfo)
    {
        this.buyerInfo = buyerInfo;
    }

    public String getItemId ()
    {
        return itemId;
    }

    public void setItemId (String itemId)
    {
        this.itemId = itemId;
    }

    public String getPrice ()
    {
        return price;
    }

    public void setPrice (String price)
    {
        this.price = price;
    }

    public String getMoneyDate ()
    {
        return moneyDate;
    }

    public void setMoneyDate (String moneyDate)
    {
        this.moneyDate = moneyDate;
    }

    public String getVariantId ()
    {
        return variantId;
    }

    public void setVariantId (String variantId)
    {
        this.variantId = variantId;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getStatusCode ()
    {
        return statusCode;
    }

    public void setStatusCode (String statusCode)
    {
        this.statusCode = statusCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [thumbImageLink = "+thumbImageLink+", amount = "+amount+", commissionRate = "+commissionRate+", productId = "+productId+", cargoPayment = "+cargoPayment+", endDate = "+endDate+", cargoCode = "+cargoCode+", shippingInfo = "+shippingInfo+", saleCode = "+saleCode+", lastActionDate = "+lastActionDate+", productTitle = "+productTitle+", buyerInfo = "+buyerInfo+", itemId = "+itemId+", price = "+price+", moneyDate = "+moneyDate+", variantId = "+variantId+", status = "+status+", statusCode = "+statusCode+"]";
    }
}
