package io.dragee.rules.dragee_extension;

import io.dragee.annotation.Dragee;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Dragee.Namespace
@Target({ElementType.TYPE})
public @interface ExtensionTest {
}