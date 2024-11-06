package com.example.plantCare.service;

import com.example.plantCare.entity.Reminder;
import com.example.plantCare.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderService {

    @Autowired
    private ReminderRepository reminderRepository;

    public List<Reminder> getAllReminders() {
        return reminderRepository.findAll();
    }

    public Reminder addReminder(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    public void deleteReminder(Long id) {
        reminderRepository.deleteById(id);
    }
}
