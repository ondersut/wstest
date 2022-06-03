package GetSalesByDateRange;

public class Sales
{
    private Sale sale;

    public Sale getSale ()
    {
        return sale;
    }

    public void setSale (Sale sale)
    {
        this.sale = sale;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [sale = "+sale+"]";
    }
}