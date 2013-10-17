
package org.soapdemo.client.generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aircraft complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aircraft">
 *   &lt;complexContent>
 *     &lt;extension base="{http://server.soapdemo.org/}entity">
 *       &lt;sequence>
 *         &lt;element name="markup1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="markupB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="priceHourPlace" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aircraft", propOrder = {
    "markup1",
    "markupB",
    "name",
    "numberOfPlaces",
    "priceHourPlace"
})
public class Aircraft
    extends Entity
{

    protected BigDecimal markup1;
    protected BigDecimal markupB;
    protected String name;
    protected short numberOfPlaces;
    protected BigDecimal priceHourPlace;

    /**
     * Gets the value of the markup1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkup1() {
        return markup1;
    }

    /**
     * Sets the value of the markup1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarkup1(BigDecimal value) {
        this.markup1 = value;
    }

    /**
     * Gets the value of the markupB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkupB() {
        return markupB;
    }

    /**
     * Sets the value of the markupB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarkupB(BigDecimal value) {
        this.markupB = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the numberOfPlaces property.
     * 
     */
    public short getNumberOfPlaces() {
        return numberOfPlaces;
    }

    /**
     * Sets the value of the numberOfPlaces property.
     * 
     */
    public void setNumberOfPlaces(short value) {
        this.numberOfPlaces = value;
    }

    /**
     * Gets the value of the priceHourPlace property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceHourPlace() {
        return priceHourPlace;
    }

    /**
     * Sets the value of the priceHourPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceHourPlace(BigDecimal value) {
        this.priceHourPlace = value;
    }

}
