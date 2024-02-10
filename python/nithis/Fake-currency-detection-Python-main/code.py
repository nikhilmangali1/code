import os
import numpy as np
import cv2
import pickle as p
def resizeAndcon(img,img1):
    res1 = cv2.resize(img, (800, 300))  # resizing the img for display
    res2 = cv2.resize(img1, (800, 300))  # resizing the img for display
    image = np.concatenate((res1, res2), axis=0)  # concatenating images for display
    return image 

for directory in ['Dataset/500/']:
    for filename in os.listdir(directory):
        img=cv2.imread(directory+'500front.jpeg')
        img1=cv2.imread(directory+'500back.jpeg')
        image=resizeAndcon(img,img1)
        img_median = cv2.medianBlur(image, 3)  # Add median filter to image
        gray = cv2.cvtColor(img_median, cv2.COLOR_BGR2GRAY)  # converting to gray scale
        edges = cv2.Canny(gray, 60, 180)  # canny edge detection
        th2 = cv2.adaptiveThreshold(edges, 255, cv2.ADAPTIVE_THRESH_MEAN_C, cv2.THRESH_BINARY, 11, 10)              # segmentation using adaptive thresholding
        #trainInput.append(np.ravel(th2.astype(np.int16, copy = False)))
        #print(filename)
    cv2.imshow('original image',image)
    cv2.imshow('noise filtered', img_median)   # filtered images
    cv2.imshow('gray scale', gray)  # gray scale
    cv2.imshow('edge detected', edges)  # edge detected
    cv2.imshow('segmented', th2)  # segmented
    cv2.waitKey(0)        # Wait for a key press to
    cv2.destroyAllWindows()  # close the img window

    outfile=open('saved.pkl','ab')
    p.dump(th2,outfile)
    outfile.close()
      
