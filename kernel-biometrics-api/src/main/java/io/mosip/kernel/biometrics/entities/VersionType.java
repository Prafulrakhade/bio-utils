//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.13 at 03:22:53 PM IST 
//

package io.mosip.kernel.biometrics.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a version number with major and minor components.
 *
 * This JAXB-generated class represents the "VersionType" element found in an XML schema. It defines a simple
 * structure to capture a version number, consisting of major and minor components. Both components are represented
 * as unsigned integers.
 *
 */
@Data
@JsonDeserialize(builder = VersionType.VersionTypeBuilder.class)
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionType", propOrder = { "major", "minor" })
public class VersionType implements Serializable {
	 /**
     * Major version number (unsigned integer).
     */
    @XmlElement(name = "Major")
    @XmlSchemaType(name = "unsignedInt")
    private int major;

    /**
     * Minor version number (unsigned integer).
     */
    @XmlElement(name = "Minor")
    @XmlSchemaType(name = "unsignedInt")
    private int minor;

	public VersionType(VersionTypeBuilder versionTypeBuilder) {
		this.major = versionTypeBuilder.major;
		this.minor = versionTypeBuilder.minor;
	}

	public static class VersionTypeBuilder {
		private int major;
		private int minor;

		public VersionTypeBuilder withMinor(int minor) {
			this.minor = minor;
			return this;
		}

		public VersionTypeBuilder withMajor(int major) {
			this.major = major;
			return this;
		}

		public VersionType build() {
			return new VersionType(this);
		}
	}
}