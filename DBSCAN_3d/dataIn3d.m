%for wine
clear
a=xlsread('wine.xlsx');
m=size(a,1);
for i=1:1:m
    if a(i,1)==1
        scatter3(a(i,20),a(i,26),a(i,28),'r.');
    elseif a(i,1)==2
        scatter3(a(i,20),a(i,26),a(i,28),'b.');
    else
        scatter3(a(i,20),a(i,26),a(i,28),'k*');  
    end
    hold on;
end


%for iris
clear
a=xlsread('iris.xlsx');
m=size(a,1);
for i=1:1:m
    if a(i,5)==1
        scatter3(a(i,6),a(i,8),a(i,9),'r.');
    elseif a(i,5)==2
        scatter3(a(i,6),a(i,8),a(i,9),'b.');
    else
        scatter3(a(i,6),a(i,8),a(i,9),'k*');  
    end
    hold on;
end
