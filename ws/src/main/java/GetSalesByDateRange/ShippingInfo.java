package GetSalesByDateRange;

public class ShippingInfo
{
    private String shippingPaymentType;

    private String cargoCode;

    private String shippingFirmName;

    private String combinedShipping;

    private String shippingExpireDate;

    public String getShippingPaymentType ()
    {
        return shippingPaymentType;
    }

    public void setShippingPaymentType (String shippingPaymentType)
    {
        this.shippingPaymentType = shippingPaymentType;
    }

    public String getCargoCode ()
    {
        return cargoCode;
    }

    public void setCargoCode (String cargoCode)
    {
        this.cargoCode = cargoCode;
    }

    public String getShippingFirmName ()
    {
        return shippingFirmName;
    }

    public void setShippingFirmName (String shippingFirmName)
    {
        this.shippingFirmName = shippingFirmName;
    }

    public String getCombinedShipping ()
    {
        return combinedShipping;
    }

    public void setCombinedShipping (String combinedShipping)
    {
        this.combinedShipping = combinedShipping;
    }

    public String getShippingExpireDate ()
    {
        return shippingExpireDate;
    }

    public void setShippingExpireDate (String shippingExpireDate)
    {
        this.shippingExpireDate = shippingExpireDate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [shippingPaymentType = "+shippingPaymentType+", cargoCode = "+cargoCode+", shippingFirmName = "+shippingFirmName+", combinedShipping = "+combinedShipping+", shippingExpireDate = "+shippingExpireDate+"]";
    }
}