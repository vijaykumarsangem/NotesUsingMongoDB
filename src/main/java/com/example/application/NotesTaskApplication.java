package com.example.application;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.application.module.Notes;

@SpringBootApplication
public class NotesTaskApplication {
	public static void main(String[] args) {
		SpringApplication.run(NotesTaskApplication.class, args);
	}

}
