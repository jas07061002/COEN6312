@echo off 
javac -d HMS Person.java Staff.java Receptionist.java Appointment.java Medicine.java Patient.java SearchPatient.java
cd .\HMS
java SearchPatient
pause