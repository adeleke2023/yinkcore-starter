package com.yinkcore.auth.infrastructure.adapter.application.dto;


/**
 * {@ LoginRequest} is a record class that represents the data transfer object (DTO) for user login requests.
 * It contains fields for email and password, which are required for authenticating a user.
 * The class is designed to be immutable and provides a concise way to represent the login data.
 *
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
public record LoginRequest(

        String email,

        String password

) {}
