
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Glyph {

    String name;
    String unicode;
    int format;
    int width;

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getFormat() {
        return format;
    }

    public String getUnicode() {
        return unicode;
    }

    @XmlAttribute
    public void setFormat(int format) {
        this.format = format;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public void setWidth(int width) {
        this.width = width;
    }

    @XmlElement
    public void setUnicode(String unicode) {
        this.unicode = unicode;
    }

    // @XmlElement
    //public void setOutline() {
        // this.outline = null;
    //}
}
