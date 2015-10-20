package org.bpim.objects;

import org.bpim.transformer.base.BPIMDataObject;

public abstract class ETollDataObject implements BPIMDataObject {

	protected String objectId;
	private static int id = 5000;
	
	public ETollDataObject(){
		objectId = String.valueOf(id);
		id++;
	}

	public String getObjectId() {
		
		return objectId;
	}

	public void setObjectId(String objectId) {
		
		this.objectId = objectId;
	}
	
}
