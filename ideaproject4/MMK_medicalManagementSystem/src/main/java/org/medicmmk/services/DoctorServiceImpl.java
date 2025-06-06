package org.medicmmk.services;

import org.medicmmk.data.models.Doctor;
import org.medicmmk.data.repository.DoctorRepository;
import org.medicmmk.dtos.requests.DoctorLoginRequest;
import org.medicmmk.dtos.requests.RegisterDoctorRequest;
import org.medicmmk.exceptions.IncorrectPasswordException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor loginDoctorToProfile(DoctorLoginRequest request) {
        Doctor foundUser = doctorRepository.findByEmail(request.getEmail()).orElse(null);
        assert foundUser != null;
        if (!foundUser.getPassword().equals(request.getPassword())) throw new IncorrectPasswordException("Wrong Password");
        return foundUser;
    }

    @Override
    public Doctor registerDoctorProfile(RegisterDoctorRequest request) {
        return doctorRepository.save(request.getDoctor());
    }

    public Doctor findDoctorProfileByUsername(String username){
        return doctorRepository.findByUsername(username).orElse(null);
    }

    public Doctor findDoctorProfileByPassword(String password){
        return doctorRepository.findByPassword(password).orElse(null);
    }

    public Doctor findDoctorProfileByEmail(String email){
        return doctorRepository.findByEmail(email).orElse(null);
    }

    public List<Doctor> findALL(){
        return doctorRepository.findAll();
    }
}
