a = importdata('result2d.txt');
m=size(a,1);
for i=1:1:m
    if a(i,3)==1
        plot(a(i,1),a(i,2),'r.');
    elseif a(i,3)==2
        plot(a(i,1),a(i,2),'b.');
    elseif a(i,3)==3
        plot(a(i,1),a(i,2),'g.');
    elseif a(i,3)==4
        plot(a(i,1),a(i,2),'c.');
    elseif a(i,3)==5
        plot(a(i,1),a(i,2),'m.');
    elseif a(i,3)==6
        plot(a(i,1),a(i,2),'y.');
    else
        plot(a(i,1),a(i,2),'k*');   
    end
    hold on;
end
grid on;
