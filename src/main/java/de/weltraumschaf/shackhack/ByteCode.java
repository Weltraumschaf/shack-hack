/*
 *  LICENSE
 *
 * "THE BEER-WARE LICENSE" (Revision 43):
 * "Sven Strittmatter" <weltraumschaf@googlemail.com> wrote this file.
 * As long as you retain this notice you can do whatever you want with
 * this stuff. If we meet some day, and you think this stuff is worth it,
 * you can buy me a non alcohol-free beer in return.
 *
 * Copyright (C) 2012 "Sven Strittmatter" <weltraumschaf@googlemail.com>
 */
package de.weltraumschaf.shackhack;

/**
 * All Java byte codes.
 *
 * @see http://en.wikipedia.org/wiki/Java_bytecode_instruction_listings
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
enum ByteCode {

    /**
     * Load onto the stack a reference from an array.
     *
     * Stack [before] → [after]: arrayref, index → value
     */
    AALOAD("aaload", (byte) 0x32),
    /**
     * Store into a reference in an array.
     *
     * Stack [before] → [after]: arrayref, index, value →
     */
    AASTORE("aastore", (byte) 0x53),
    /**
     * Push a 'null' reference onto the stack.
     *
     * Stack [before] → [after]: → null
     */
    ACONST_NULL("aconst_null", (byte) 0x01),
    /**
     * Load a reference onto the stack from a local variable '#index'.
     *
     * Other bytes 1: index
     *
     * Stack [before] → [after]: → objectref
     */
    ALOAD("aload", (byte) 0x19),
    /**
     * Load a reference onto the stack from local variable 0.
     *
     * Stack [before] → [after]: → objectref
     */
    ALOAD_0("aload_0", (byte) 0x2a),
    /**
     * Load a reference onto the stack from local variable 1.
     *
     * Stack [before] → [after]: → objectref
     */
    ALOAD_1("aload_1", (byte) 0x2b),
    /**
     * Load a reference onto the stack from local variable 2.
     *
     * Stack [before] → [after]: → objectref
     */
    ALOAD_2("aload_2", (byte) 0x2c),
    /**
     * Load a reference onto the stack from local variable 3.
     *
     * Stack [before] → [after]: → objectref
     */
    ALOAD_3("aload_3", (byte) 0x2d),
    /**
     * Create a new array of references of length 'count' and component type identified by the class reference 'index'
     * ('indexbyte1 &lt;&lt; 8 + indexbyte2') in the constant pool.
     *
     * Other bytes 2: indexbyte1, indexbyte2
     *
     * Stack [before] → [after]: count → arrayref
     */
    ANEWARRAY("anewarray", (byte) 0xbd),
    /**
     * Return a reference from a method.
     *
     * Stack [before] → [after]: objectref → [empty]
     */
    ARETURN("areturn", (byte) 0xb0),
    /**
     * Get the length of an array.
     *
     * Stack [before] → [after]: arrayref → length
     */
    ARRAYLENGTH("arraylength", (byte) 0xbe),
    /**
     * Store a reference into a local variable '#index'.
     *
     * Other bytes 1: index
     *
     * Stack [before] → [after]: objectref →
     */
    ASTORE("astore", (byte) 0x3a),
    /**
     * Store a reference into local variable 0.
     *
     * Stack [before] → [after]: objectref →
     */
    ASTORE_0("astore_0", (byte) 0x4b),
    /**
     * Store a reference into local variable 1.
     *
     * Stack [before] → [after]: objectref →
     */
    ASTORE_1("astore_1", (byte) 0x4c),
    /**
     * Store a reference into local variable 2.
     *
     * Stack [before] → [after]: objectref →
     */
    ASTORE_2("astore_2", (byte) 0x4d),
    /**
     * Store a reference into local variable 3.
     *
     * Stack [before] → [after]: objectref →
     */
    ASTORE_3("astore_3", (byte) 0x4e),
    /**
     * Throws an error or exception (notice that the rest of the stack is cleared, leaving only a reference to the
     * Throwable).
     *
     * Stack [before] → [after]: objectref → [empty], objectref
     */
    ATHROW("athrow", (byte) 0xbf),
    /**
     * Load a byte or Boolean value from an array.
     *
     * Stack [before] → [after]: arrayref, index → value
     */
    BALOAD("baload", (byte) 0x33),
    /**
     * Store a byte or Boolean value into an array.
     *
     * Stack [before] → [after]: arrayref, index, value →
     */
    BASTORE("bastore", (byte) 0x54),
    /**
     * Push a 'byte' onto the stack as an integer 'value'.
     *
     * Other bytes 1: byte
     *
     * Stack [before] → [after]: → value
     */
    BIPUSH("bipush", (byte) 0x10),
    /**
     * Load a char from an array.
     *
     * Stack [before] → [after]: arrayref, index → value
     */
    CALOAD("caload", (byte) 0x34),
    /**
     * Store a char into an array.
     *
     * Stack [before] → [after]: arrayref, index, value →
     */
    CASTORE("castore", (byte) 0x55),
    /**
     * Checks whether an 'objectref' is of a certain type, the class reference of which is in the constant pool at
     * 'index' ('indexbyte1 &lt;&lt; 8 + indexbyte2').
     *
     * Other bytes 2: indexbyte1, indexbyte2
     *
     * Stack [before] → [after]: objectref → objectref
     */
    CHECKCAST("checkcast", (byte) 0xc0),
    /**
     * Add two doubles.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    DADD("dadd", (byte) 0x63),
    /**
     * Load a double from an array.
     *
     * Stack [before] → [after]: arrayref, index → value
     */
    DALOAD("daload", (byte) 0x31),
    /**
     * Store a double into an array.
     *
     * Stack [before] → [after]: arrayref, index, value →
     */
    DASTORE("dastore", (byte) 0x52),
    /**
     * Compare two doubles.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    DCMPG("dcmpg", (byte) 0x98),
    /**
     * Compare two doubles.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    DCMPL("dcmpl", (byte) 0x97),
    /**
     * Push the constant '0.0' onto the stack.
     *
     * Stack [before] → [after]: → 0.0
     */
    DCONST_0("dconst_0", (byte) 0x0e),
    /**
     * Push the constant '1.0' onto the stack.
     *
     * Stack [before] → [after]: → 1.0
     */
    DCONST_1("dconst_1", (byte) 0x0f),
    /**
     * Divide two doubles.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    DDIV("ddiv", (byte) 0x6f),
    /**
     * Load a double 'value' from a local variable '#index'.
     *
     * Other bytes 1: index
     *
     * Stack [before] → [after]: → value
     */
    DLOAD("dload", (byte) 0x18),
    /**
     * Load a double from local variable 0.
     *
     * Stack [before] → [after]: → value
     */
    DLOAD_0("dload_0", (byte) 0x26),
    /**
     * Load a double from local variable 1.
     *
     * Stack [before] → [after]: → value
     */
    DLOAD_1("dload_1", (byte) 0x27),
    /**
     * Load a double from local variable 2.
     *
     * Stack [before] → [after]: → value
     */
    DLOAD_2("dload_2", (byte) 0x28),
    /**
     * Load a double from local variable 3.
     *
     * Stack [before] → [after]: → value
     */
    DLOAD_3("dload_3", (byte) 0x29),
    /**
     * Multiply two doubles.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    DMUL("dmul", (byte) 0x6b),
    /**
     * Negate a double.
     *
     * Stack [before] → [after]: value → result
     */
    DNEG("dneg", (byte) 0x77),
    /**
     * Get the remainder from a division between two doubles.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    DREM("drem", (byte) 0x73),
    /**
     * Return a double from a method.
     *
     * Stack [before] → [after]: value → [empty]
     */
    DRETURN("dreturn", (byte) 0xaf),
    /**
     * Store a double 'value' into a local variable '#index'.
     *
     * Other bytes 1: index
     *
     * Stack [before] → [after]: value →
     */
    DSTORE("dstore", (byte) 0x39),
    /**
     * Store a double into local variable 0.
     *
     * Stack [before] → [after]: value →
     */
    DSTORE_0("dstore_0", (byte) 0x47),
    /**
     * Store a double into local variable 1.
     *
     * Stack [before] → [after]: value →
     */
    DSTORE_1("dstore_1", (byte) 0x48),
    /**
     * Store a double into local variable 2.
     *
     * Stack [before] → [after]: value →
     */
    DSTORE_2("dstore_2", (byte) 0x49),
    /**
     * Store a double into local variable 3.
     *
     * Stack [before] → [after]: value →
     */
    DSTORE_3("dstore_3", (byte) 0x4a),
    /**
     * Subtract a double from another.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    DSUB("dsub", (byte) 0x67),
    /**
     * Duplicate the value on top of the stack.
     *
     * Stack [before] → [after]: value → value, value
     */
    DUP("dup", (byte) 0x59),
    /**
     * Insert a copy of the top value into the stack two values from the top. value1 and value2 must not be of the type
     * double or long..
     *
     * Stack [before] → [after]: value2, value1 → value1, value2, value1
     */
    DUP_X1("dup_x1", (byte) 0x5a),
    /**
     * Insert a copy of the top value into the stack two (if value2 is double or long it takes up the entry of value3,
     * too) or three values (if value2 is neither double nor long) from the top.
     *
     * Stack [before] → [after]: value3, value2, value1 → value1, value3, value2, value1
     */
    DUP_X2("dup_x2", (byte) 0x5b),
    /**
     * Duplicate top two stack words (two values, if value1 is not double nor long; a single value, if value1 is double
     * or long).
     *
     * Stack [before] → [after]: {value2, value1} → {value2, value1}, {value2, value1}
     */
    DUP2("dup2", (byte) 0x5c),
    /**
     * Duplicate two words and insert beneath third word (see explanation above).
     *
     * Stack [before] → [after]: value3, {value2, value1} → {value2, value1}, value3, {value2, value1}
     */
    DUP2_X1("dup2_x1", (byte) 0x5d),
    /**
     * Duplicate two words and insert beneath fourth word.
     *
     * Stack [before] → [after]: {value4, value3}, {value2, value1} → {value2, value1}, {value4, value3}, {value2,
     * value1}
     */
    DUP2_X2("dup2_x2", (byte) 0x5e),
    /**
     * Add two floats.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    FADD("fadd", (byte) 0x62),
    /**
     * Load a float from an array.
     *
     * Stack [before] → [after]: arrayref, index → value
     */
    FALOAD("faload", (byte) 0x30),
    /**
     * Store a float in an array.
     *
     * Stack [before] → [after]: arrayref, index, value →
     */
    FASTORE("fastore", (byte) 0x51),
    /**
     * Compare two floats.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    FCMPG("fcmpg", (byte) 0x96),
    /**
     * Compare two floats.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    FCMPL("fcmpl", (byte) 0x95),
    /**
     * Push '0.0f' on the stack.
     *
     * Stack [before] → [after]: → 0.0f
     */
    FCONST_0("fconst_0", (byte) 0x0b),
    /**
     * Push '1.0f' on the stack.
     *
     * Stack [before] → [after]: → 1.0f
     */
    FCONST_1("fconst_1", (byte) 0x0c),
    /**
     * Push '2.0f' on the stack.
     *
     * Stack [before] → [after]: → 2.0f
     */
    FCONST_2("fconst_2", (byte) 0x0d),
    /**
     * Divide two floats.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    FDIV("fdiv", (byte) 0x6e),
    /**
     * Load a float 'value' from a local variable '#index'.
     *
     * Other bytes 1: index
     *
     * Stack [before] → [after]: → value
     */
    FLOAD("fload", (byte) 0x17),
    /**
     * Load a float 'value' from local variable 0.
     *
     * Stack [before] → [after]: → value
     */
    FLOAD_0("fload_0", (byte) 0x22),
    /**
     * Load a float 'value' from local variable 1.
     *
     * Stack [before] → [after]: → value
     */
    FLOAD_1("fload_1", (byte) 0x23),
    /**
     * Load a float 'value' from local variable 2.
     *
     * Stack [before] → [after]: → value
     */
    FLOAD_2("fload_2", (byte) 0x24),
    /**
     * Load a float 'value' from local variable 3.
     *
     * Stack [before] → [after]: → value
     */
    FLOAD_3("fload_3", (byte) 0x25),
    /**
     * Multiply two floats.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    FMUL("fmul", (byte) 0x6a),
    /**
     * Negate a float.
     *
     * Stack [before] → [after]: value → result
     */
    FNEG("fneg", (byte) 0x76),
    /**
     * Get the remainder from a division between two floats.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    FREM("frem", (byte) 0x72),
    /**
     * Return a float.
     *
     * Stack [before] → [after]: value → [empty]
     */
    FRETURN("freturn", (byte) 0xae),
    /**
     * Store a float 'value' into a local variable '#index'.
     *
     * Other bytes 1: index
     *
     * Stack [before] → [after]: value →
     */
    FSTORE("fstore", (byte) 0x38),
    /**
     * Store a float 'value' into local variable 0.
     *
     * Stack [before] → [after]: value →
     */
    FSTORE_0("fstore_0", (byte) 0x43),
    /**
     * Store a float 'value' into local variable 1.
     *
     * Stack [before] → [after]: value →
     */
    FSTORE_1("fstore_1", (byte) 0x44),
    /**
     * Store a float 'value' into local variable 2.
     *
     * Stack [before] → [after]: value →
     */
    FSTORE_2("fstore_2", (byte) 0x45),
    /**
     * Store a float 'value' into local variable 3.
     *
     * Stack [before] → [after]: value →
     */
    FSTORE_3("fstore_3", (byte) 0x46),
    /**
     * Subtract two floats.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    FSUB("fsub", (byte) 0x66),
    /**
     * Get a field 'value' of an object 'objectref', where the field is identified by field reference in the constant
     * pool 'index' ('index1 &lt;&lt; 8 + index2').
     *
     * Other bytes 2: index1, index2
     *
     * Stack [before] → [after]: objectref → value
     */
    GETFIELD("getfield", (byte) 0xb4),
    /**
     * Get a static field 'value' of a class, where the field is identified by field reference in the constant pool
     * 'index' ('index1 &lt;&lt; 8 + index2').
     *
     * Other bytes 2: index1, index2
     *
     * Stack [before] → [after]: → value
     */
    GETSTATIC("getstatic", (byte) 0xb2),
    /**
     * Goes to another instruction at 'branchoffset' (signed short constructed from unsigned bytes 'branchbyte1 &lt;&lt;
     * 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: [no change]
     */
    GOTO("goto", (byte) 0xa7),
    /**
     * Goes to another instruction at 'branchoffset' (signed int constructed from unsigned bytes 'branchbyte1 &lt;&lt;
     * 24 + 'branchbyte2 &lt;&lt; 16 + 'branchbyte3 &lt;&lt; 8 + branchbyte4').
     *
     * Other bytes 4: branchbyte1, branchbyte2, branchbyte3, branchbyte4
     *
     * Stack [before] → [after]: [no change]
     */
    GOTO_W("goto_w", (byte) 0xc8),
    /**
     * Convert an int into a long.
     *
     * Stack [before] → [after]: value → result
     */
    I2L("i2l", (byte) 0x85),
    /**
     * Convert an int into a float.
     *
     * Stack [before] → [after]: value → result
     */
    I2F("i2f", (byte) 0x86),
    /**
     * Convert an int into a double.
     *
     * Stack [before] → [after]: value → result
     */
    I2D("i2d", (byte) 0x87),
    /**
     * Convert a long to a int.
     *
     * Stack [before] → [after]: value → result
     */
    L2I("l2i", (byte) 0x88),
    /**
     * Convert a long to a float.
     *
     * Stack [before] → [after]: value → result
     */
    L2F("l2f", (byte) 0x89),
    /**
     * Convert a long to a double.
     *
     * Stack [before] → [after]: value → result
     */
    L2D("l2d", (byte) 0x8a),
    /**
     * Convert a float to an int.
     *
     * Stack [before] → [after]: value → result
     */
    F2I("f2i", (byte) 0x8b),
    /**
     * Convert a float to a long.
     *
     * Stack [before] → [after]: value → result
     */
    F2L("f2l", (byte) 0x8c),
    /**
     * Convert a float to a double.
     *
     * Stack [before] → [after]: value → result
     */
    F2D("f2d", (byte) 0x8d),
    /**
     * Convert a double to an int.
     *
     * Stack [before] → [after]: value → result
     */
    D2I("d2i", (byte) 0x8e),
    /**
     * Convert a double to a long.
     *
     * Stack [before] → [after]: value → result
     */
    D2L("d2l", (byte) 0x8f),
    /**
     * Convert a double to a float.
     *
     * Stack [before] → [after]: value → result
     */
    D2F("d2f", (byte) 0x90),
    /**
     * Convert an int into a byte.
     *
     * Stack [before] → [after]: value → result
     */
    I2B("i2b", (byte) 0x91),
    /**
     * Convert an int into a character.
     *
     * Stack [before] → [after]: value → result
     */
    I2C("i2c", (byte) 0x92),
    /**
     * Convert an int into a short.
     *
     * Stack [before] → [after]: value → result
     */
    I2S("i2s", (byte) 0x93),
    /**
     * Add two ints.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    IADD("iadd", (byte) 0x60),
    /**
     * Load an int from an array.
     *
     * Stack [before] → [after]: arrayref, index → value
     */
    IALOAD("iaload", (byte) 0x2e),
    /**
     * Perform a bitwise and on two integers.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    IAND("iand", (byte) 0x7e),
    /**
     * Store an int into an array.
     *
     * Stack [before] → [after]: arrayref, index, value →
     */
    IASTORE("iastore", (byte) 0x4f),
    /**
     * Load the int value -1 onto the stack.
     *
     * Stack [before] → [after]: → -1
     */
    ICONST_M1("iconst_m1", (byte) 0x02),
    /**
     * Load the int value 0 onto the stack.
     *
     * Stack [before] → [after]: → 0
     */
    ICONST_0("iconst_0", (byte) 0x03),
    /**
     * Load the int value 1 onto the stack.
     *
     * Stack [before] → [after]: → 1
     */
    ICONST_1("iconst_1", (byte) 0x04),
    /**
     * Load the int value 2 onto the stack.
     *
     * Stack [before] → [after]: → 2
     */
    ICONST_2("iconst_2", (byte) 0x05),
    /**
     * Load the int value 3 onto the stack.
     *
     * Stack [before] → [after]: → 3
     */
    ICONST_3("iconst_3", (byte) 0x06),
    /**
     * Load the int value 4 onto the stack.
     *
     * Stack [before] → [after]: → 4
     */
    ICONST_4("iconst_4", (byte) 0x07),
    /**
     * Load the int value 5 onto the stack.
     *
     * Stack [before] → [after]: → 5
     */
    ICONST_5("iconst_5", (byte) 0x08),
    /**
     * Divide two integers.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    IDIV("idiv", (byte) 0x6c),
    /**
     * If references are equal, branch to instruction at 'branchoffset' (signed short constructed from unsigned bytes
     * 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value1, value2 →
     */
    IF_ACMPEQ("if_acmpeq", (byte) 0xa5),
    /**
     * If references are not equal, branch to instruction at 'branchoffset' (signed short constructed from unsigned
     * bytes 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value1, value2 →
     */
    IF_ACMPNE("if_acmpne", (byte) 0xa6),
    /**
     * If ints are equal, branch to instruction at 'branchoffset' (signed short constructed from unsigned bytes
     * 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value1, value2 →
     */
    IF_ICMPEQ("if_icmpeq", (byte) 0x9f),
    /**
     * If ints are not equal, branch to instruction at 'branchoffset' (signed short constructed from unsigned bytes
     * 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value1, value2 →
     */
    IF_ICMPNE("if_icmpne", (byte) 0xa0),
    /**
     * If 'value1' is less than 'value2', branch to instruction at 'branchoffset' (signed short constructed from
     * unsigned bytes 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value1, value2 →
     */
    IF_ICMPLT("if_icmplt", (byte) 0xa1),
    /**
     * If 'value1' is greater than or equal to 'value2', branch to instruction at 'branchoffset' (signed short
     * constructed from unsigned bytes 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value1, value2 →
     */
    IF_ICMPGE("if_icmpge", (byte) 0xa2),
    /**
     * If 'value1' is greater than 'value2', branch to instruction at 'branchoffset' (signed short constructed from
     * unsigned bytes 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value1, value2 →
     */
    IF_ICMPGT("if_icmpgt", (byte) 0xa3),
    /**
     * If 'value1' is less than or equal to 'value2', branch to instruction at 'branchoffset' (signed short constructed
     * from unsigned bytes 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value1, value2 →
     */
    IF_ICMPLE("if_icmple", (byte) 0xa4),
    /**
     * If 'value' is 0, branch to instruction at 'branchoffset' (signed short constructed from unsigned bytes
     * 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value →
     */
    IFEQ("ifeq", (byte) 0x99),
    /**
     * If 'value' is not 0, branch to instruction at 'branchoffset' (signed short constructed from unsigned bytes
     * 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value →
     */
    IFNE("ifne", (byte) 0x9a),
    /**
     * If 'value' is less than 0, branch to instruction at 'branchoffset' (signed short constructed from unsigned bytes
     * 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value →
     */
    IFLT("iflt", (byte) 0x9b),
    /**
     * If 'value' is greater than or equal to 0, branch to instruction at 'branchoffset' (signed short constructed from
     * unsigned bytes 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value →
     */
    IFGE("ifge", (byte) 0x9c),
    /**
     * If 'value' is greater than 0, branch to instruction at 'branchoffset' (signed short constructed from unsigned
     * bytes 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value →
     */
    IFGT("ifgt", (byte) 0x9d),
    /**
     * If 'value' is less than or equal to 0, branch to instruction at 'branchoffset' (signed short constructed from
     * unsigned bytes 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value →
     */
    IFLE("ifle", (byte) 0x9e),
    /**
     * If 'value' is not null, branch to instruction at 'branchoffset' (signed short constructed from unsigned bytes
     * 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value →
     */
    IFNONNULL("ifnonnull", (byte) 0xc7),
    /**
     * If 'value' is null, branch to instruction at 'branchoffset' (signed short constructed from unsigned bytes
     * 'branchbyte1 &lt;&lt; 8 + branchbyte2').
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: value →
     */
    IFNULL("ifnull", (byte) 0xc6),
    /**
     * Increment local variable '#index' by signed byte 'const'.
     *
     * Other bytes 2: index, const
     *
     * Stack [before] → [after]: [No change]
     */
    IINC("iinc", (byte) 0x84),
    /**
     * Load an int 'value' from a local variable '#index'.
     *
     * Other bytes 1: index
     *
     * Stack [before] → [after]: → value
     */
    ILOAD("iload", (byte) 0x15),
    /**
     * Load an int 'value' from local variable 0.
     *
     * Stack [before] → [after]: → value
     */
    ILOAD_0("iload_0", (byte) 0x1a),
    /**
     * Load an int 'value' from local variable 1.
     *
     * Stack [before] → [after]: → value
     */
    ILOAD_1("iload_1", (byte) 0x1b),
    /**
     * Load an int 'value' from local variable 2.
     *
     * Stack [before] → [after]: → value
     */
    ILOAD_2("iload_2", (byte) 0x1c),
    /**
     * Load an int 'value' from local variable 3.
     *
     * Stack [before] → [after]: → value
     */
    ILOAD_3("iload_3", (byte) 0x1d),
    /**
     * Multiply two integers.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    IMUL("imul", (byte) 0x68),
    /**
     * Negate int.
     *
     * Stack [before] → [after]: value → result
     */
    INEG("ineg", (byte) 0x74),
    /**
     * Determines if an object 'objectref' is of a given type, identified by class reference 'index' in constant pool
     * ('indexbyte1 &lt;&lt; 8 + indexbyte2').
     *
     * Other bytes 2: indexbyte1, indexbyte2
     *
     * Stack [before] → [after]: objectref → result
     */
    INSTANCEOF("instanceof", (byte) 0xc1),
    /**
     * Invokes a dynamic method identified by method reference 'index' in constant pool ('indexbyte1 &lt;&lt; 8 +
     * indexbyte2').
     *
     * Other bytes 4: indexbyte1, indexbyte2, 0, 0
     *
     * Stack [before] → [after]: [arg1, [arg2 ...]] →
     */
    INVOKEDYNAMIC("invokedynamic", (byte) 0xba),
    /**
     * Invokes an interface method on object 'objectref', where the interface method is identified by method reference
     * 'index' in constant pool ('indexbyte1 &lt;&lt; 8 + indexbyte2').
     *
     * Other bytes 4: indexbyte1, indexbyte2, count, 0
     *
     * Stack [before] → [after]: objectref, [arg1, arg2, ...] →
     */
    INVOKEINTERFACE("invokeinterface", (byte) 0xb9),
    /**
     * Invoke instance method on object 'objectref', where the method is identified by method reference 'index' in
     * constant pool ('indexbyte1 &lt;&lt; 8 + indexbyte2').
     *
     * Other bytes 2: indexbyte1, indexbyte2
     *
     * Stack [before] → [after]: objectref, [arg1, arg2, ...] →
     */
    INVOKESPECIAL("invokespecial", (byte) 0xb7),
    /**
     * Invoke a static method, where the method is identified by method reference 'index' in constant pool ('indexbyte1
     * &lt;&lt; 8 + indexbyte2').
     *
     * Other bytes 2: indexbyte1, indexbyte2
     *
     * Stack [before] → [after]: [arg1, arg2, ...] →
     */
    INVOKESTATIC("invokestatic", (byte) 0xb8),
    /**
     * Invoke virtual method on object 'objectref', where the method is identified by method reference 'index' in
     * constant pool ('indexbyte1 &lt;&lt; 8 + indexbyte2').
     *
     * Other bytes 2: indexbyte1, indexbyte2
     *
     * Stack [before] → [after]: objectref, [arg1, arg2, ...] →
     */
    INVOKEVIRTUAL("invokevirtual", (byte) 0xb6),
    /**
     * Bitwise int or.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    IOR("ior", (byte) 0x80),
    /**
     * Logical int remainder.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    IREM("irem", (byte) 0x70),
    /**
     * Return an integer from a method.
     *
     * Stack [before] → [after]: value → [empty]
     */
    IRETURN("ireturn", (byte) 0xac),
    /**
     * Int shift left.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    ISHL("ishl", (byte) 0x78),
    /**
     * Int arithmetic shift right.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    ISHR("ishr", (byte) 0x7a),
    /**
     * Store int 'value' into variable '#index'.
     *
     * Other bytes 1: index
     *
     * Stack [before] → [after]: value →
     */
    ISTORE("istore", (byte) 0x36),
    /**
     * Store int 'value' into variable 0.
     *
     * Stack [before] → [after]: value →
     */
    ISTORE_0("istore_0", (byte) 0x3b),
    /**
     * Store int 'value' into variable 1.
     *
     * Stack [before] → [after]: value →
     */
    ISTORE_1("istore_1", (byte) 0x3c),
    /**
     * Store int 'value' into variable 2.
     *
     * Stack [before] → [after]: value →
     */
    ISTORE_2("istore_2", (byte) 0x3d),
    /**
     * Store int 'value' into variable 3.
     *
     * Stack [before] → [after]: value →
     */
    ISTORE_3("istore_3", (byte) 0x3e),
    /**
     * Int subtract.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    ISUB("isub", (byte) 0x64),
    /**
     * Int logical shift right.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    IUSHR("iushr", (byte) 0x7c),
    /**
     * Int xor.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    IXOR("ixor", (byte) 0x82),
    /**
     * Jump to subroutine at 'branchoffset' (signed short constructed from unsigned bytes 'branchbyte1 &lt;&lt; 8 +
     * branchbyte2') and place the return address on the stack.
     *
     * Other bytes 2: branchbyte1, branchbyte2
     *
     * Stack [before] → [after]: → address
     */
    JSR("jsr", (byte) 0xa8),
    /**
     * Jump to subroutine at 'branchoffset' (signed int constructed from unsigned bytes 'branchbyte1 &lt;&lt; 24 +
     * branchbyte2 &lt;&lt; 16 + branchbyte3 &lt;&lt; 8 + branchbyte4') and place the return address on the stack.
     *
     * Other bytes 4: branchbyte1, branchbyte2, branchbyte3, branchbyte4
     *
     * Stack [before] → [after]: → address
     */
    JSR_W("jsr_w", (byte) 0xc9),
    /**
     * Add two longs.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    LADD("ladd", (byte) 0x61),
    /**
     * Load a long from an array.
     *
     * Stack [before] → [after]: arrayref, index → value
     */
    LALOAD("laload", (byte) 0x2f),
    /**
     * Bitwise and of two longs.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    LAND("land", (byte) 0x7f),
    /**
     * Store a long to an array.
     *
     * Stack [before] → [after]: arrayref, index, value →
     */
    LASTORE("lastore", (byte) 0x50),
    /**
     * Compare two longs values.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    LCMP("lcmp", (byte) 0x94),
    /**
     * Push the long 0 onto the stack.
     *
     * Stack [before] → [after]: → 0L
     */
    LCONST_0("lconst_0", (byte) 0x09),
    /**
     * Push the long 1 onto the stack.
     *
     * Stack [before] → [after]: → 1L
     */
    LCONST_1("lconst_1", (byte) 0x0a),
    /**
     * Push a constant '#index' from a constant pool (String, int or float) onto the stack.
     *
     * Other bytes 1: index
     *
     * Stack [before] → [after]: → value
     */
    LDC("ldc", (byte) 0x12),
    /**
     * Push a constant '#index' from a constant pool (String, int or float) onto the stack (wide 'index' is constructed
     * as 'indexbyte1 &lt;&lt; 8 + indexbyte2').
     *
     * Other bytes 2: indexbyte1, indexbyte2
     *
     * Stack [before] → [after]: → value
     */
    LDC_W("ldc_w", (byte) 0x13),
    /**
     * Push a constant '#index' from a constant pool (double or long) onto the stack (wide 'index' is constructed as
     * 'indexbyte1 &lt;&lt; 8 + indexbyte2').
     *
     * Other bytes 2: indexbyte1, indexbyte2
     *
     * Stack [before] → [after]: → value
     */
    LDC2_W("ldc2_w", (byte) 0x14),
    /**
     * Divide two longs.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    LDIV("ldiv", (byte) 0x6d),
    /**
     * Load a long value from a local variable '#index'.
     *
     * Other bytes 1: index
     *
     * Stack [before] → [after]: → value
     */
    LLOAD("lload", (byte) 0x16),
    /**
     * Load a long value from a local variable 0.
     *
     * Stack [before] → [after]: → value
     */
    LLOAD_0("lload_0", (byte) 0x1e),
    /**
     * Load a long value from a local variable 1.
     *
     * Stack [before] → [after]: → value
     */
    LLOAD_1("lload_1", (byte) 0x1f),
    /**
     * Load a long value from a local variable 2.
     *
     * Stack [before] → [after]: → value
     */
    LLOAD_2("lload_2", (byte) 0x20),
    /**
     * Load a long value from a local variable 3.
     *
     * Stack [before] → [after]: → value
     */
    LLOAD_3("lload_3", (byte) 0x21),
    /**
     * Multiply two longs.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    LMUL("lmul", (byte) 0x69),
    /**
     * Negate a long.
     *
     * Stack [before] → [after]: value → result
     */
    LNEG("lneg", (byte) 0x75),
    /**
     * A target address is looked up from a table using a key and execution continues from the instruction at that
     * address.
     *
     * Other bytes 4+: &lt;0-3 bytes padding&gt;, defaultbyte1, defaultbyte2, defaultbyte3, defaultbyte4, npairs1,
     * npairs2, npairs3, npairs4, match-offset pairs...
     *
     * Stack [before] → [after]: key →
     */
    LOOKUPSWITCH("lookupswitch", (byte) 0xab),
    /**
     * Bitwise or of two longs.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    LOR("lor", (byte) 0x81),
    /**
     * Remainder of division of two longs.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    LREM("lrem", (byte) 0x71),
    /**
     * Return a long value.
     *
     * Stack [before] → [after]: value → [empty]
     */
    LRETURN("lreturn", (byte) 0xad),
    /**
     * Bitwise shift left of a long 'value1' by 'value2' positions.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    LSHL("lshl", (byte) 0x79),
    /**
     * Bitwise shift right of a long 'value1' by 'value2' positions.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    LSHR("lshr", (byte) 0x7b),
    /**
     * Store a long 'value' in a local variable '#index'.
     *
     * Other bytes 1: index
     *
     * Stack [before] → [after]: value →
     */
    LSTORE("lstore", (byte) 0x37),
    /**
     * Store a long 'value' in a local variable 0.
     *
     * Stack [before] → [after]: value →
     */
    LSTORE_0("lstore_0", (byte) 0x3f),
    /**
     * Store a long 'value' in a local variable 1.
     *
     * Stack [before] → [after]: value →
     */
    LSTORE_1("lstore_1", (byte) 0x40),
    /**
     * Store a long 'value' in a local variable 2.
     *
     * Stack [before] → [after]: value →
     */
    LSTORE_2("lstore_2", (byte) 0x41),
    /**
     * Store a long 'value' in a local variable 3.
     *
     * Stack [before] → [after]: value →
     */
    LSTORE_3("lstore_3", (byte) 0x42),
    /**
     * Subtract two longs.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    LSUB("lsub", (byte) 0x65),
    /**
     * Bitwise shift right of a long 'value1' by 'value2' positions, unsigned.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    LUSHR("lushr", (byte) 0x7d),
    /**
     * Bitwise exclusive or of two longs.
     *
     * Stack [before] → [after]: value1, value2 → result
     */
    LXOR("lxor", (byte) 0x83),
    /**
     * Enter monitor for object ("grab the lock" - start of synchronized() section).
     *
     * Stack [before] → [after]: objectref →
     */
    MONITORENTER("monitorenter", (byte) 0xc2),
    /**
     * Exit monitor for object ("release the lock" - end of synchronized() section).
     *
     * Stack [before] → [after]: objectref →
     */
    MONITOREXIT("monitorexit", (byte) 0xc3),
    /**
     * Create a new array of 'dimensions' dimensions with elements of type identified by class reference in constant
     * pool 'index' ('indexbyte1 &lt;&lt; 8 + indexbyte2'); the sizes of each dimension is identified by 'count1',
     * ['count2', etc.].
     *
     * Other bytes 3: indexbyte1, indexbyte2, dimensions
     *
     * Stack [before] → [after]: count1, [count2,...] → arrayref
     */
    MULTIANEWARRAY("multianewarray", (byte) 0xc5),
    /**
     * Create new object of type identified by class reference in constant pool 'index' ('indexbyte1 &lt;&lt; 8 +
     * indexbyte2').
     *
     * Other bytes 2: indexbyte1, indexbyte2
     *
     * Stack [before] → [after]: → objectref
     */
    NEW("new", (byte) 0xbb),
    /**
     * Create new array with 'count' elements of primitive type identified by 'atype'.
     *
     * Other bytes 1: atype
     *
     * Stack [before] → [after]: count → arrayref
     */
    NEWARRAY("newarray", (byte) 0xbc),
    /**
     * Perform no operation.
     *
     * Stack [before] → [after]: [No change]
     */
    NOP("nop", (byte) 0x00),
    /**
     * Discard the top value on the stack.
     *
     * Stack [before] → [after]: value →
     */
    POP("pop", (byte) 0x57),
    /**
     * Discard the top two values on the stack (or one value, if it is a double or long).
     *
     * Stack [before] → [after]: {value2, value1} →
     */
    POP2("pop2", (byte) 0x58),
    /**
     * Set field to 'value' in an object 'objectref', where the field is identified by a field reference 'index' in
     * constant pool ('indexbyte1 &lt;&lt; 8 + indexbyte2').
     *
     * Other bytes 2: indexbyte1, indexbyte2
     *
     * Stack [before] → [after]: objectref, value →
     */
    PUTFIELD("putfield", (byte) 0xb5),
    /**
     * Set static field to 'value' in a class, where the field is identified by a field reference 'index' in constant
     * pool ('indexbyte1 &lt;&lt; 8 + indexbyte2').
     *
     * Other bytes 2: indexbyte1, indexbyte2
     *
     * Stack [before] → [after]: value →
     */
    PUTSTATIC("putstatic", (byte) 0xb3),
    /**
     * Continue execution from address taken from a local variable '#index' (the asymmetry with jsr is intentional).
     *
     * Other bytes 1: index
     *
     * Stack [before] → [after]: [No change]
     */
    RET("ret", (byte) 0xa9),
    /**
     * Return void from method.
     *
     * Stack [before] → [after]: → [empty]
     */
    RETURN("return", (byte) 0xb1),
    /**
     * Load short from array.
     *
     * Stack [before] → [after]: arrayref, index → value
     */
    SALOAD("saload", (byte) 0x35),
    /**
     * Store short to array.
     *
     * Stack [before] → [after]: arrayref, index, value →
     */
    SASTORE("sastore", (byte) 0x56),
    /**
     * Push a short onto the stack.
     *
     * Other bytes 2: byte1, byte2
     *
     * Stack [before] → [after]: → value
     */
    SIPUSH("sipush", (byte) 0x11),
    /**
     * Swaps two top words on the stack (note that value1 and value2 must not be double or long).
     *
     * Stack [before] → [after]: value2, value1 → value1, value2
     */
    SWAP("swap", (byte) 0x5f),
    /**
     * Continue execution from an address in the table at offset 'index'.
     *
     * Other bytes 4+: [0-3 bytes padding], defaultbyte1, defaultbyte2, defaultbyte3, defaultbyte4, lowbyte1, lowbyte2,
     * lowbyte3, lowbyte4, highbyte1, highbyte2, highbyte3, highbyte4, jump offsets...
     *
     * Stack [before] → [after]: index →
     */
    TABLESWITCH("tableswitch", (byte) 0xaa),
    /**
     * Execute 'opcode', where 'opcode' is either iload, fload, aload, lload, dload, istore, fstore, astore, lstore,
     * dstore, or ret, but assume the 'index' is 16 bit; or execute iinc, where the 'index' is 16 bits and the constant
     * to increment by is a signed 16 bit short.
     *
     * Other bytes 3/5: opcode, indexbyte1, indexbyte2 or iinc, indexbyte1, indexbyte2, countbyte1, countbyte2
     *
     * Stack [before] → [after]: [same as for corresponding instructions]
     */
    WIDE("wide", (byte) 0xc4),
    /**
     * Reserved for breakpoints in Java debuggers; should not appear in any class file.
     */
    BREAKPOINT("breakpoint", (byte) 0xca),
    /**
     * Reserved for implementation-dependent operations within debuggers; should not appear in any class file.
     */
    IMPDEP1("impdep1", (byte) 0xfe),
    /**
     * Reserved for implementation-dependent operations within debuggers; should not appear in any class file.
     */
    IMPDEP2("impdep2", (byte) 0xff);

    private final String mnemonic;
    private final byte opcode;

    private ByteCode(final String mnemonic, final byte opcode) {
        this.mnemonic = mnemonic;
        this.opcode = opcode;
    }

    public String mnemonic() {
        return mnemonic;
    }

    @Override
    public String toString() {
        return String.format("%s, (%d)", mnemonic, opcode);
    }
}
