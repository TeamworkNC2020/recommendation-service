'use strict';

const userIdInputRef = $('#userIdInput');
const messageInputRef = $('#messageInput');

let ws = new SockJS('http://localhost:8082/ws');
let stomp = Stomp.over(ws);

stomp.debug = () => {
    // console.log(message);
};
stomp.connect();

function onConnectButtonClick() {
    console.log("onConnectButtonClick")
    const topic = "/topic/users/" + getUserId() + "/chat-bot/messages";
    console.log(topic);
    stomp.subscribe(topic, function (message) {
        onRetrieveMessage(JSON.parse(message.body));
    });
}


function onSendButtonClick() {
    console.log("onSendButtonClick")
    const topic = "/app/chat-bot/send";
    const data = {
        userId: getUserId(),
        text: getMessage(),
    }
    stomp.send(topic, {}, JSON.stringify(data));
}


function onRetrieveMessage(message) {
    console.log("onRetrieveMessage");
    console.log(message);
}

function getUserId() {
    return userIdInputRef.val();
}

function getMessage() {
    return messageInputRef.val();
}