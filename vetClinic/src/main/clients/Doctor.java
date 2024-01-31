package main.clients;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    public String name;
    public String specialization;
    public int experience;
    private List<Animal> patients;

    public Doctor(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.patients = new ArrayList<>();
    }

    /**
     * Обследование пациента
     */
    public void diagnosePatient(Animal patient) {
        System.out.println("Доктор " + name + " ставит диагноз '" + patient.getNickName() + "' " + patient.illness);
    }

    /**
     * Назначаем лечение
     */
    public void treatment(Animal patient, String medication) {
        System.out.println("Доктор " + name + " прописывает " + medication + " для больного с " + patient.illness);
    }

    /**
     * Выписка
     */
    public void dischargePatient(Animal patient) {
        System.out.println("Доктор " + name + " вылечил " + patient.getNickName());
        patients.add(patient);
    }
}
