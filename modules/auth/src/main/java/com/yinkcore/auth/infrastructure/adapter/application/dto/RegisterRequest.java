package com.yinkcore.auth.infrastructure.adapter.application.dto;

/**
 * RegisterRequest is a record class that represents the data transfer object (DTO) for user registration requests.
 * It contains fields for firstName, lastName, email, and password, which are required for registering a new user.
 * The class is designed to be immutable and provides a concise way to represent the registration data.
 *
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
public record RegisterRequest(

        String firstName,

        String lastName,

        String email,

        String password

) {}
