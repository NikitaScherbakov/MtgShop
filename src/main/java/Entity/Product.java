package Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "products")
public class Product implements Serializable{
    private static final long serialVersionUID = -1000119078147252957L;

    private Date createDate;
    private String code;
    private String cardName;
    private byte[] cardImage;
    private String cardDetails;
    private int cardNumber;
    private double price;

    @Id
    @Column(name = "Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "Card_Name")
    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    @Lob
    @Column(name = "Card_Image")
    public byte[] getCardImage() {
        return cardImage;
    }

    public void setCardImage(byte[] cardImage) {
        this.cardImage = cardImage;
    }

    @Column(name = "Card_Details")
    public String getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(String cardDetails) {
        this.cardDetails = cardDetails;
    }

    @Column(name = "Card_Number")
    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Column(name = "Price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Create_Date", nullable = false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
