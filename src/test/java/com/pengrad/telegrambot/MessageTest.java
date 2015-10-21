package com.pengrad.telegrambot;

import com.pengrad.telegrambot.model.Message;

import static org.junit.Assert.assertNotNull;

/**
 * stas
 * 10/21/15.
 */
public class MessageTest {

    public static void checkMessage(Message message) {
        assertNotNull(message.message_id);
        assertNotNull(message.date);
        ChatTest.checkChat(message.chat);
    }

    public static void checkForwardedMessage(Message message) {
        checkMessage(message);
        assertNotNull(message.forward_date);
        UserTest.checkUser(message.forward_from);
    }

    public static void checkTextdMessage(Message message) {
        checkMessage(message);
        assertNotNull(message.text);
    }

    public static void checkPhotoMessage(Message message) {
        checkMessage(message);
        PhotoSizeTest.checkPhotos(message.photo);
    }

    public static void checkAudioMessage(Message message) {
        checkMessage(message);
        AudioTest.checkAudio(message.audio);
    }

    public static void checkDocumentMessage(Message message) {
        checkMessage(message);
        DocumentTest.check(message.document);
    }

    public static void checkStickerMessage(Message message) {
        checkMessage(message);
        StickerTest.check(message.sticker);
    }

    public static void checkVideoMessage(Message message) {
        checkMessage(message);
        //todo: add caption
//        assertNotNull(message.caption);
        VideoTest.check(message.video);
    }

    public static void checkLocationMessage(Message message) {
        checkMessage(message);
        LocationTest.check(message.location);
    }
}
