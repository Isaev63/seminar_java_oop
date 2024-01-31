package main.clients;

public class Nurse extends Doctor {
    public Nurse(String name, String specialization, int experience) {
        super(name, specialization, experience);
    }

    /**
     * Помогаем врачу с пациентом
     */
    public void assistDoctor(Doctor doctor, Animal patient) {
        System.out.println("Медсестра " + name + " помогает доктору " + doctor.name + " с пациентом " + patient.getNickName());
    }

    /**
     * Лечение пациента
     */
    public void administerMedication(Animal patient, String medication) {
        System.out.println("Медсестра " + name + " назначает " + medication + " пациенту " + patient.getNickName());
    }

    /**
     * Наблюдение за состоянием пациента
     */
    public void monitorPatient(Animal patient) {
        System.out.println("Медсестра " + name + " следит за состоянием пациента " + patient.getNickName());
    }
}