package org.onedevman.mc.plugins.passcraft.authentication.types;

public enum AuthResult {
    SUCCESS,
    INVALID_PASSWORD_FORMAT,
    ALREADY_LOGGED,
    ALREADY_REGISTERED,
    ALREADY_LINKED,
    TAG_ALREADY_USED,
    NOT_LOGGED,
    NOT_REGISTERED,
    NOT_LINKED,
    DISCORD_USER_NOT_FOUND,
    WRONG_PASSWORD,
    TIMED_OUT,
    REJECTED,
    DISCORD_AUTH_DISABLED,
    FAILED
}
