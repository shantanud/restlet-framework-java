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
import org.restlet.test.ext.odata.deepexpand.model.Branch;
import org.restlet.test.ext.odata.deepexpand.model.Category;
import org.restlet.test.ext.odata.deepexpand.model.CoOp;
import org.restlet.test.ext.odata.deepexpand.model.CompanyPerson;
import org.restlet.test.ext.odata.deepexpand.model.InsuranceContract;
import org.restlet.test.ext.odata.deepexpand.model.JobPosting;
import org.restlet.test.ext.odata.deepexpand.model.Multilingual;

/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="http://praktiki.metal.ntua.gr/CoopOData/CoopOData.svc/$metadata">Metadata of the target OData service</a>
*
*/
public class Company {

    private String email;
    private int id;
    private boolean offersCompensation;
    private String taxCode;
    private String taxDivision;
    private String webSite;
    private Tracking tracking;
    private ActivitySector activitySector;
    private List<Branch> branches = new ArrayList<Branch>();
    private Category category;
    private Branch centralBranch;
    private Multilingual comments;
    private CompanyPerson contactPerson;
    private List<CoOp> coOps = new ArrayList<CoOp>();
    private List<InsuranceContract> insuranceContracts = new ArrayList<InsuranceContract>();
    private List<JobPosting> jobPostings = new ArrayList<JobPosting>();
    private Multilingual name;
    private List<CompanyPerson> persons = new ArrayList<CompanyPerson>();

    /**
     * Constructor without parameter.
     * 
     */
    public Company() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public Company(int id) {
        this();
        this.id = id;
    }

   /**
    * Returns the value of the "email" attribute.
    *
    * @return The value of the "email" attribute.
    */
   public String getEmail() {
      return email;
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
    * Returns the value of the "offersCompensation" attribute.
    *
    * @return The value of the "offersCompensation" attribute.
    */
   public boolean getOffersCompensation() {
      return offersCompensation;
   }
   /**
    * Returns the value of the "taxCode" attribute.
    *
    * @return The value of the "taxCode" attribute.
    */
   public String getTaxCode() {
      return taxCode;
   }
   /**
    * Returns the value of the "taxDivision" attribute.
    *
    * @return The value of the "taxDivision" attribute.
    */
   public String getTaxDivision() {
      return taxDivision;
   }
   /**
    * Returns the value of the "webSite" attribute.
    *
    * @return The value of the "webSite" attribute.
    */
   public String getWebSite() {
      return webSite;
   }
   /**
    * Returns the value of the "tracking" attribute.
    *
    * @return The value of the "tracking" attribute.
    */
   public Tracking getTracking() {
      return tracking;
   }
   /**
    * Returns the value of the "activitySector" attribute.
    *
    * @return The value of the "activitySector" attribute.
    */
   public ActivitySector getActivitySector() {
      return activitySector;
   }
   
   /**
    * Returns the value of the "branches" attribute.
    *
    * @return The value of the "branches" attribute.
    */
   public List<Branch> getBranches() {
      return branches;
   }
   
   /**
    * Returns the value of the "category" attribute.
    *
    * @return The value of the "category" attribute.
    */
   public Category getCategory() {
      return category;
   }
   
   /**
    * Returns the value of the "centralBranch" attribute.
    *
    * @return The value of the "centralBranch" attribute.
    */
   public Branch getCentralBranch() {
      return centralBranch;
   }
   
   /**
    * Returns the value of the "comments" attribute.
    *
    * @return The value of the "comments" attribute.
    */
   public Multilingual getComments() {
      return comments;
   }
   
   /**
    * Returns the value of the "contactPerson" attribute.
    *
    * @return The value of the "contactPerson" attribute.
    */
   public CompanyPerson getContactPerson() {
      return contactPerson;
   }
   
   /**
    * Returns the value of the "coOps" attribute.
    *
    * @return The value of the "coOps" attribute.
    */
   public List<CoOp> getCoOps() {
      return coOps;
   }
   
   /**
    * Returns the value of the "insuranceContracts" attribute.
    *
    * @return The value of the "insuranceContracts" attribute.
    */
   public List<InsuranceContract> getInsuranceContracts() {
      return insuranceContracts;
   }
   
   /**
    * Returns the value of the "jobPostings" attribute.
    *
    * @return The value of the "jobPostings" attribute.
    */
   public List<JobPosting> getJobPostings() {
      return jobPostings;
   }
   
   /**
    * Returns the value of the "name" attribute.
    *
    * @return The value of the "name" attribute.
    */
   public Multilingual getName() {
      return name;
   }
   
   /**
    * Returns the value of the "persons" attribute.
    *
    * @return The value of the "persons" attribute.
    */
   public List<CompanyPerson> getPersons() {
      return persons;
   }
   
   /**
    * Sets the value of the "email" attribute.
    *
    * @param email
    *     The value of the "email" attribute.
    */
   public void setEmail(String email) {
      this.email = email;
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
    * Sets the value of the "offersCompensation" attribute.
    *
    * @param offersCompensation
    *     The value of the "offersCompensation" attribute.
    */
   public void setOffersCompensation(boolean offersCompensation) {
      this.offersCompensation = offersCompensation;
   }
   /**
    * Sets the value of the "taxCode" attribute.
    *
    * @param taxCode
    *     The value of the "taxCode" attribute.
    */
   public void setTaxCode(String taxCode) {
      this.taxCode = taxCode;
   }
   /**
    * Sets the value of the "taxDivision" attribute.
    *
    * @param taxDivision
    *     The value of the "taxDivision" attribute.
    */
   public void setTaxDivision(String taxDivision) {
      this.taxDivision = taxDivision;
   }
   /**
    * Sets the value of the "webSite" attribute.
    *
    * @param webSite
    *     The value of the "webSite" attribute.
    */
   public void setWebSite(String webSite) {
      this.webSite = webSite;
   }
   /**
    * Sets the value of the "tracking" attribute.
    *
    * @param tracking
    *     The value of the "tracking" attribute.
    */
   public void setTracking(Tracking tracking) {
      this.tracking = tracking;
   }
   
   /**
    * Sets the value of the "activitySector" attribute.
    *
    * @param activitySector"
    *     The value of the "activitySector" attribute.
    */
   public void setActivitySector(ActivitySector activitySector) {
      this.activitySector = activitySector;
   }

   /**
    * Sets the value of the "branches" attribute.
    *
    * @param branches"
    *     The value of the "branches" attribute.
    */
   public void setBranches(List<Branch> branches) {
      this.branches = branches;
   }

   /**
    * Sets the value of the "category" attribute.
    *
    * @param category"
    *     The value of the "category" attribute.
    */
   public void setCategory(Category category) {
      this.category = category;
   }

   /**
    * Sets the value of the "centralBranch" attribute.
    *
    * @param centralBranch"
    *     The value of the "centralBranch" attribute.
    */
   public void setCentralBranch(Branch centralBranch) {
      this.centralBranch = centralBranch;
   }

   /**
    * Sets the value of the "comments" attribute.
    *
    * @param comments"
    *     The value of the "comments" attribute.
    */
   public void setComments(Multilingual comments) {
      this.comments = comments;
   }

   /**
    * Sets the value of the "contactPerson" attribute.
    *
    * @param contactPerson"
    *     The value of the "contactPerson" attribute.
    */
   public void setContactPerson(CompanyPerson contactPerson) {
      this.contactPerson = contactPerson;
   }

   /**
    * Sets the value of the "coOps" attribute.
    *
    * @param coOps"
    *     The value of the "coOps" attribute.
    */
   public void setCoOps(List<CoOp> coOps) {
      this.coOps = coOps;
   }

   /**
    * Sets the value of the "insuranceContracts" attribute.
    *
    * @param insuranceContracts"
    *     The value of the "insuranceContracts" attribute.
    */
   public void setInsuranceContracts(List<InsuranceContract> insuranceContracts) {
      this.insuranceContracts = insuranceContracts;
   }

   /**
    * Sets the value of the "jobPostings" attribute.
    *
    * @param jobPostings"
    *     The value of the "jobPostings" attribute.
    */
   public void setJobPostings(List<JobPosting> jobPostings) {
      this.jobPostings = jobPostings;
   }

   /**
    * Sets the value of the "name" attribute.
    *
    * @param name"
    *     The value of the "name" attribute.
    */
   public void setName(Multilingual name) {
      this.name = name;
   }

   /**
    * Sets the value of the "persons" attribute.
    *
    * @param persons"
    *     The value of the "persons" attribute.
    */
   public void setPersons(List<CompanyPerson> persons) {
      this.persons = persons;
   }

}