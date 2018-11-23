package io.github.ningbin.security.saml.web.odata.model.jpa;

import javax.persistence.Embeddable;

@Embeddable
public class Description {

    private String name;
    private String producer;

    Description() {
    }

    public Description(String name, String producer) {
	this.name = name;
	this.producer = producer;
    }

    public String getName() {
	return name;
    }

    public String getProducer() {
	return producer;
    }

}
