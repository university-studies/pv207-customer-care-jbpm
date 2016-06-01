package fi.muni.pv207.ticket;

import fi.muni.pv207.registration.Customer;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BusinessCase implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Tile")
   private java.lang.String title;
   @org.kie.api.definition.type.Label("Description")
   private java.lang.String description;
   @org.kie.api.definition.type.Label("Priority")
   private java.lang.Integer priority;
   @org.kie.api.definition.type.Label("Email")
   private java.lang.String email;

   public Employee employee;
   public Customer customer;

   @org.kie.api.definition.type.Label("Id")
   private java.lang.Integer id;

   @org.kie.api.definition.type.Label("Note from L1 operator")
   private java.lang.String noteFromL1;

   @org.kie.api.definition.type.Label(value = "Translated Description")
   private java.lang.String translatedDescription;

   @org.kie.api.definition.type.Label(value = "Translated Solution")
   private java.lang.String translatedSolution;

   public BusinessCase()
   {
   }

   public java.lang.String getTitle()
   {
      return this.title;
   }

   public void setTitle(java.lang.String title)
   {
      this.title = title;
   }

   public java.lang.String getDescription()
   {
      return this.description;
   }

   public void setDescription(java.lang.String description)
   {
      this.description = description;
   }

   public java.lang.Integer getPriority()
   {
      return this.priority;
   }

   public void setPriority(java.lang.Integer priority)
   {
      this.priority = priority;
   }

   public java.lang.String getEmail()
   {
      return this.email;
   }

   public void setEmail(java.lang.String email)
   {
      this.email = email;
   }

   public java.lang.Integer getId()
   {
      return this.id;
   }

   public void setId(java.lang.Integer id)
   {
      this.id = id;
   }

   public BusinessCase(java.lang.String title, java.lang.String description,
         java.lang.Integer priority, java.lang.String email, java.lang.Integer id)
   {
      this.title = title;
      this.description = description;
      this.priority = priority;
      this.email = email;
      this.id = id;
   }

   @Override
   public String toString()
   {
      return "BusinessCase{" +
            "title='" + title + '\'' +
            ", description='" + description + '\'' +
            ", priority=" + priority +
            ", email='" + email + '\'' +
            ", id=" + id +
            '}';
   }

   public java.lang.String getNoteFromL1()
   {
      return this.noteFromL1;
   }

   public void setNoteFromL1(java.lang.String noteFromL1)
   {
      this.noteFromL1 = noteFromL1;
   }

   public BusinessCase(java.lang.String title, java.lang.String description,
         java.lang.Integer priority, java.lang.String email,
         fi.muni.pv207.ticket.Employee employee, java.lang.Integer id,
         java.lang.String noteFromL1)
   {
      this.title = title;
      this.description = description;
      this.priority = priority;
      this.email = email;
      this.employee = employee;
      this.id = id;
      this.noteFromL1 = noteFromL1;
   }

   public java.lang.String getTranslatedDescription()
   {
      return this.translatedDescription;
   }

   public void setTranslatedDescription(java.lang.String translatedDescription)
   {
      this.translatedDescription = translatedDescription;
   }

   public java.lang.String getTranslatedSolution()
   {
      return this.translatedSolution;
   }

   public void setTranslatedSolution(java.lang.String translatedSolution)
   {
      this.translatedSolution = translatedSolution;
   }

   public BusinessCase(java.lang.String title, java.lang.String description,
         java.lang.Integer priority, java.lang.String email,
         fi.muni.pv207.ticket.Employee employee,
         fi.muni.pv207.registration.Customer customer, java.lang.Integer id,
         java.lang.String noteFromL1, java.lang.String translatedDescription,
         java.lang.String translatedSolution)
   {
      this.title = title;
      this.description = description;
      this.priority = priority;
      this.email = email;
      this.employee = employee;
      this.customer = customer;
      this.id = id;
      this.noteFromL1 = noteFromL1;
      this.translatedDescription = translatedDescription;
      this.translatedSolution = translatedSolution;
   }
}
