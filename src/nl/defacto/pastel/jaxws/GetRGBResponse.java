
package nl.defacto.pastel.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getRGBResponse", namespace = "http://pastel.defacto.nl/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRGBResponse", namespace = "http://pastel.defacto.nl/")
public class GetRGBResponse {

    @XmlElement(name = "return", namespace = "", nillable = true)
    private int[] _return;

    /**
     * 
     * @return
     *     returns int[]
     */
    public int[] getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(int[] _return) {
        this._return = _return;
    }

}
