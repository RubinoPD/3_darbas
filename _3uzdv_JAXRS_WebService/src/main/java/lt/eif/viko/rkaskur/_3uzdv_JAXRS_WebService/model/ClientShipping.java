package lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.model;



import jakarta.persistence.*;

import java.util.Objects;

/**
 * The ClientShipping class represents the shipping information of a client.
 * It contains information such as the client's phone number, address, and postal code.
 */

@Entity
public class ClientShipping {

    /**
     * The ID of the shipping information.
     */
    @Id
    @GeneratedValue

    private int id;

    /**
     * The phone number of the client.
     */
    private int phoneNumber;

    /**
     * The address of the client.
     */
    private String address;

    /**
     * The postal code of the client.
     */
    private String postCode;

    /**
     * Creates an empty instance of the ClientShipping class.
     */
    public ClientShipping() {
    }

    /**
     * Returns the ID of the shipping information.
     *
     * @return the ID of the shipping inforclmation.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the shipping information.
     *
     * @param id the ID of the shipping information.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the phone number of the client.
     *
     * @return the phone number of the client.
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the client.
     *
     * @param phoneNumber the phone number of the client.
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the address of the client.
     *
     * @return the address of the client.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the client.
     *
     * @param address the address of the client.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the postal code of the client.
     *
     * @return the postal code of the client.
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the postal code of the client.
     *
     * @param postCode the postal code of the client.
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }



    /**
     * Creates an instance of the ClientShipping class with the given ID, phone number, address, and postal code.
     *
     * @param id          the ID of the shipping information.
     * @param phoneNumber the phone number of the client.
     * @param address     the address of the client.
     * @param postCode    the postal code of the client.
     */
    public ClientShipping(int id, int phoneNumber, String address, String postCode) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.postCode = postCode;
    }

    /**
     * Creates an instance of the ClientShipping class with the given phone number, address, and postal code.
     *
     * @param phoneNumber the phone number of the client.
     * @param address     the address of the client.
     * @param postCode    the postal code of the client.
     */
    public ClientShipping(int phoneNumber, String address, String postCode) {
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return
                String.format("\tPhoneNumber = %s\n\t\t" +
                                "Address = %s\n\t\t" +
                                "PostCode = %s",
                        this.phoneNumber,
                        this.address,
                        this.postCode);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientShipping that = (ClientShipping) o;
        return id == that.id && phoneNumber == that.phoneNumber && Objects.equals(address, that.address) && Objects.equals(postCode, that.postCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneNumber, address, postCode);
    }
}
