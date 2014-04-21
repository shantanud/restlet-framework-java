/**
 * Copyright 2005-2013 Restlet S.A.S.
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL
 * 1.0 (the "Licenses"). You can select the license that you prefer but you may
 * not use this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://www.restlet.com/products/restlet-framework
 * 
 * Restlet is a registered trademark of Restlet S.A.S.
 */

package org.restlet.test.ext.odata.deepexpand.model;


import java.util.ArrayList;
import java.util.List;

import org.restlet.test.ext.odata.deepexpand.model.ActivitySector;
import org.restlet.test.ext.odata.deepexpand.model.Company;

/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="http://praktiki.metal.ntua.gr/CoopOData/CoopOData.svc/$metadata">Metadata of the target OData service</a>
*
*/
public class ActivitySector {

    private String code;
    private String description;
    private int id;
    private List<ActivitySector> childActivitySectors = new ArrayList<ActivitySector>();
    private List<Company> companies = new ArrayList<Company>();
    private ActivitySector parentActivitySector;

    /**
     * Constructor without parameter.
     * 
     */
    public ActivitySector() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public ActivitySector(int id) {
        this();
        this.id = id;
    }

   /**
    * Returns the value of the "code" attribute.
    *
    * @return The value of the "code" attribute.
    */
   public String getCode() {
      return code;
   }
   /**
    * Returns the value of the "description" attribute.
    *
    * @return The value of the "description" attribute.
    */
   public String getDescription() {
      return description;
   }
   /**
    * Returns the value of the "id" attribute.
    *
    * @return The value of the "id" attribute.
    */
   public int getId() {
      return id;
   }
   /**
    * Returns the value of the "childActivitySectors" attribute.
    *
    * @return The value of the "childActivitySectors" attribute.
    */
   public List<ActivitySector> getChildActivitySectors() {
      return childActivitySectors;
   }
   
   /**
    * Returns the value of the "companies" attribute.
    *
    * @return The value of the "companies" attribute.
    */
   public List<Company> getCompanies() {
      return companies;
   }
   
   /**
    * Returns the value of the "parentActivitySector" attribute.
    *
    * @return The value of the "parentActivitySector" attribute.
    */
   public ActivitySector getParentActivitySector() {
      return parentActivitySector;
   }
   
   /**
    * Sets the value of the "code" attribute.
    *
    * @param code
    *     The value of the "code" attribute.
    */
   public void setCode(String code) {
      this.code = code;
   }
   /**
    * Sets the value of the "description" attribute.
    *
    * @param description
    *     The value of the "description" attribute.
    */
   public void setDescription(String description) {
      this.description = description;
   }
   /**
    * Sets the value of the "id" attribute.
    *
    * @param id
    *     The value of the "id" attribute.
    */
   public void setId(int id) {
      this.id = id;
   }
   /**
    * Sets the value of the "childActivitySectors" attribute.
    *
    * @param childActivitySectors"
    *     The value of the "childActivitySectors" attribute.
    */
   public void setChildActivitySectors(List<ActivitySector> childActivitySectors) {
      this.childActivitySectors = childActivitySectors;
   }

   /**
    * Sets the value of the "companies" attribute.
    *
    * @param companies"
    *     The value of the "companies" attribute.
    */
   public void setCompanies(List<Company> companies) {
      this.companies = companies;
   }

   /**
    * Sets the value of the "parentActivitySector" attribute.
    *
    * @param parentActivitySector"
    *     The value of the "parentActivitySector" attribute.
    */
   public void setParentActivitySector(ActivitySector parentActivitySector) {
      this.parentActivitySector = parentActivitySector;
   }

}