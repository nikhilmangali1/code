import cv2
import numpy as np
from skimage.metrics import structural_similarity
import pickle
# for selecting the curreny for checking genuinity
import tkinter as tk
from tkinter import filedialog
from speak import Speaking

root = tk.Tk()
root.withdraw()
root.call('wm', 'attributes', '.', '-topmost', True)
file_path1 = filedialog.askopenfilename()
print(file_path1)
file_path2 = filedialog.askopenfilename()
print(file_path2)
img2 = cv2.imread(file_path1)  # reading the image file
img3 = cv2.imread(file_path2)
res3 = cv2.resize(img2, (800, 300))  # resizing the img for display
res4 = cv2.resize(img3, (800, 300))  # resizing the img for display
image2 = np.concatenate((res3, res4), axis=0)  # for displaing images vertically concatenating the images
img_median1 = cv2.medianBlur(image2, 3)  # Add median filter to image
gray1 = cv2.cvtColor(img_median1, cv2.COLOR_BGR2GRAY)  # converting to gray scale
edges1 = cv2.Canny(gray1, 60, 180)  # canny edge detection
th21 = cv2.adaptiveThreshold(edges1, 255, cv2.ADAPTIVE_THRESH_MEAN_C, cv2.THRESH_BINARY, 11, 10)  # segmentation using adaptive thresholding
cv2.imshow('selected image', image2)  # original images
cv2.imshow('noise filtered', img_median1)   # filtered images
cv2.imshow('gray scale', gray1)  # gray scale
cv2.imshow('edge detected', edges1)  # edge detected
cv2.imshow('segmented', th21)  # edge detected
cv2.waitKey(0)  # Wait for a key press to
cv2.destroyAllWindows()  # close the img window

# comparing saved image and test imagje of currency
# loading saved segmented image


infile = open('saved.pkl', 'rb')
th2 = pickle.load(infile)
infile.close()


(score, diff) = structural_similarity(th2, th21, full=True)
#diff = (diff * 255).astype("uint8")
print("SSIM: {}".format(score))
#cv2.imshow('difference', diff)
cv2.waitKey(0)  # Wait for a key press to
cv2.destroyAllWindows()  # close the img window

import pyttsx3  
# initialize Text-to-speech engine  
engine = pyttsx3.init()  
# convert this text to speech  
   

from tkinter import messagebox
speak=Speaking()
if score ==1:
    messagebox.showinfo("Message", "GIVEN CURRENCY IS ORIGINAL")
    #speak.speak("given currency is original")
    text = "Python is a great programming language"
    engine.say(text)  
    # play the speech  
    engine.runAndWait() 


else:

    messagebox.showinfo("Message", "GIVEN CURRENCY IS FAKE")

