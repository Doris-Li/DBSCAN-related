a = importdata("wineC.txt");
m=size(a,1);
for i=1:1:m
    if a(i,4)==1
        scatter3(a(i,1),a(i,2),a(i,3),'r.');
    elseif a(i,4)==2
        scatter3(a(i,1),a(i,2),a(i,3),'b.');
    elseif a(i,4)==3
        scatter3(a(i,1),a(i,2),a(i,3),'g.');
     elseif a(i,4)==4
        scatter3(a(i,1),a(i,2),a(i,3),'y.');
    else
        scatter3(a(i,1),a(i,2),a(i,3),'k*');  
    end
    hold on;
end
grid on;
