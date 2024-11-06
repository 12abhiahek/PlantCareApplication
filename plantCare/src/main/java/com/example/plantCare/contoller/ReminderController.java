package com.example.plantCare.contoller;

import com.example.plantCare.entity.Reminder;
import com.example.plantCare.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ReminderController {

    @Autowired
    private ReminderService reminderService;

    @GetMapping
    public ResponseEntity<List<Reminder>> getAllReminders() {
        return ResponseEntity.ok(reminderService.getAllReminders());
    }

    @PostMapping
    public ResponseEntity<Reminder> addReminder(@RequestBody Reminder reminder) {
        return ResponseEntity.ok(reminderService.addReminder(reminder));
    }
}
