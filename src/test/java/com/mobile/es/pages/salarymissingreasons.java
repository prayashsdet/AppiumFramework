package com.mobile.es.pages;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class salarymissingreasons {
	 
	List<String> documents = Arrays.asList("Document 1", "Document 2", "Document 3", "Document 4", "Document 5", "Document 6", "Document 7");
	List<String> completedDocuments = new ArrayList<>();

	for (int i = 1; i <= 7; i++) {
	    String documentLocator = findDocumentLocator(i);
	    if (documentLocator != null) {
	        int documentIndex = findDocumentIndex(documentLocator);
	        if (documentIndex >= 0 && !completedDocuments.contains(documents.get(documentIndex))) {
	            String document = documents.get(documentIndex);
	            // upload the document
	            uploadDocument(document);
	        
	            // perform additional steps specific to this document
	            if (document.equals("Document 1")) {
	                // perform additional steps for Document 1
	            } else if (document.equals("Document 2")) {
	                // perform additional steps for Document 2
	            } else if (document.equals("Document 3")) {
	                // perform additional steps for Document 3
	            }
	            // ...and so on for each document
	        
	            completedDocuments.add(document);
	        }
	    }
	}
	public String findDocumentLocator(int i) {
	    String locator = null;
	    try {
	        locator = driver.findElement(By.cssSelector(".document-input:nth-of-type(" + i + ")")).getAttribute("id");
	    } catch (NoSuchElementException e) {
	        // element not found, do nothing
	    }
	    return locator;
	}
	public int findDocumentIndex(String locator) {
	    String documentName = locator.replace("document-input-", "");
	    int index = documents.indexOf(documentName);
	    return index;
	}
}

}



}
