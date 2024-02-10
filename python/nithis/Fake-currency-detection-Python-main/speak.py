import pyttsx3
class Speaking:
    @staticmethod
    def speak(audio):
        engine = pyttsx3.init('sapi5')
        voices = engine.getProperty('voices')
        newVoiceRate = 160
        engine.setProperty('voice', voices[1].id)
        engine.setProperty('rate', newVoiceRate)
        engine.say(audio)
        engine.runAndWait()

'''class Prompt:
    @staticmethod
    def first():
        speak = Speaking()
        speak.speak("Which word do you want to find the meaning sir?")'''
