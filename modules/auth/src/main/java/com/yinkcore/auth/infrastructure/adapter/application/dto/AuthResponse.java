package com.yinkcore.auth.infrastructure.adapter.application.dto;

/**
 * AuthResponse is a record class that represents the data transfer object (DTO) for authentication responses.
 * It contains fields for accessToken and refreshToken, which are returned to the client after successful authentication.
 * The class is designed to be immutable and provides a concise way to represent the authentication response data.
 *
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
public record AuthResponse(

        String accessToken,

        String refreshToken

) {
}